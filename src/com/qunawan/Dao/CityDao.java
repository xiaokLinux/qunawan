package com.qunawan.Dao;

import java.util.List;

import com.qunawan.entity.City;

public interface CityDao {
	public List<City> getCitiesByType(int type);
	public List<City> getCities(int province_id, int type);
	public City getCityById(int id);
}
