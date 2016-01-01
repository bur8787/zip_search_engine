package jp.suzutt.zip_search_engine.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ZipSearchDao {

	private static final String SQL = "SELECT * FROM ZIP WHERE ZIP_CD = ?";

	public void search(int zipCode) throws Exception {
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa",
				"");
		PreparedStatement prepareStatement = conn.prepareStatement(SQL);
		prepareStatement.setInt(1, zipCode);
		ResultSet resultSet = prepareStatement.executeQuery();
		
		while(resultSet.next()){
			resultSet.getString("prefecture_name_knj");
			resultSet.getString("city_name_knj");
			resultSet.getString("address_name_knj");
		}
		conn.close();
	}
}