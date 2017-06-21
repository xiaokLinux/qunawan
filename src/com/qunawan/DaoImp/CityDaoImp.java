package com.qunawan.DaoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.qunawan.Dao.CityDao;
import com.qunawan.entity.City;
@Repository
public class CityDaoImp implements CityDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public List<City> getCitiesByType(int type) {
		// TODO Auto-generated method stub
		return (List<City>) hibernateTemplate.find("FROM City c WHERE c.type = 1");
	}
	@Override
	public List<City> getCities(int province_id, int type) {
		// TODO Auto-generated method stub
		return (List<City>) hibernateTemplate.find("SELECT id, name FROM City c WHERE c.city = " + province_id + "AND c.type = 2");
	}
	@Override
	public City getCityById(int id) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(City.class, id);
	}

}
