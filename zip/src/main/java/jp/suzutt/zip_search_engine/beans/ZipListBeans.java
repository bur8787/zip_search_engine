package jp.suzutt.zip_search_engine.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ZipListBeans implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<ZipBeans> zipList = new ArrayList<ZipBeans>();

	/**
	 * @return the zipList
	 */
	public List<ZipBeans> getZipList() {
		return zipList;
	}

	/**
	 * @param zipList the zipList to set
	 */
	public void setZipList(List<ZipBeans> zipList) {
		this.zipList = zipList;
	}

	public void addZip(ZipBeans zipBeans) {
		zipList.add(zipBeans);
	}

}