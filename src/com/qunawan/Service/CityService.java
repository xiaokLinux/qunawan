package com.qunawan.Service;

import java.util.List;

import com.qunawan.entity.City;

public interface CityService {
	public List<City> getCitiesByType(int type);
	public List<City> getCities(int province_id, int type);
}
