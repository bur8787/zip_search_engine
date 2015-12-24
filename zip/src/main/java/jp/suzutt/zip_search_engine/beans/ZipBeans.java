package jp.suzutt.zip_search_engine.beans;

import java.io.Serializable;

public class ZipBeans implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int zipCode;
	
	private String prefectureName;

	private String cityName;

	private String addressName;

	/**
	 * @return the zipCode
	 */
	public int getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the prefectureName
	 */
	public String getPrefectureName() {
		return prefectureName;
	}

	/**
	 * @param prefectureName the prefectureName to set
	 */
	public void setPrefectureName(String prefectureName) {
		this.prefectureName = prefectureName;
	}

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the addressName
	 */
	public String getAddressName() {
		return addressName;
	}

	/**
	 * @param addressName the addressName to set
	 */
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	
}
