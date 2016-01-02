package jp.suzutt.zip_search_engine.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.suzutt.zip_search_engine.beans.ZipBeans;
import jp.suzutt.zip_search_engine.beans.ZipListBeans;

public class ZipSearchDao {

	private static final String SQL = "SELECT * FROM ZIP WHERE ZIP_CD = ?";

	public ZipListBeans search(int zipCode) throws Exception {
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa",
				"");
		PreparedStatement prepareStatement = conn.prepareStatement(SQL);
		prepareStatement.setInt(1, zipCode);
		ResultSet resultSet = prepareStatement.executeQuery();
		
		ZipListBeans zipListBeans = new ZipListBeans();
		
		while(resultSet.next()){
			ZipBeans zipBeans = new ZipBeans();
			
			zipBeans.setZipCode(resultSet.getInt("ZIP_CD"));
			zipBeans.setPrefectureName(resultSet.getString("PREFECTURE_NAME_KNJ"));
			zipBeans.setCityName(resultSet.getString("CITY_NAME_KNJ"));
			zipBeans.setAddressName(resultSet.getString("ADDRESS_NAME_KNJ"));
			
			zipListBeans.addZip(zipBeans);
		}
		conn.close();
		
		return zipListBeans;
	}
}