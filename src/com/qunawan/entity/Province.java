package com.qunawan.entity;

import java.util.ArrayList;
import java.util.List;

public class Province {
	public List<String> provinces;
	
	public Province() {
		provinces = new ArrayList<String>();
	}
	
	public List<String> getProvinces() {
		return provinces;
	}

	public void setProvinces(List<String> provinces) {
		this.provinces = provinces;
	}
	
	public void addProvince(String province) {
		provinces.add(province);
	}
}
