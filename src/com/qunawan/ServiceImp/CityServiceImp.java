package com.qunawan.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.qunawan.Dao.CityDao;
import com.qunawan.Service.CityService;
import com.qunawan.entity.City;
@Service
@Transactional(propagation=Propagation.REQUIRED)
public class CityServiceImp implements CityService {
	@Autowired
	private CityDao cityDao;
	@Override
	public List<City> getCitiesByType(int type) {
		// TODO Auto-generated method stub
		return cityDao.getCitiesByType(type);
	}
	@Override
	public List<City> getCities(int province_id, int type) {
		// TODO Auto-generated method stub
		return cityDao.getCities(province_id, type);
	}
	
}
