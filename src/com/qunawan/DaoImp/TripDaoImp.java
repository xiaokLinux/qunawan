package com.qunawan.DaoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.qunawan.Dao.TripDao;
import com.qunawan.entity.Trip;
@Repository
public class TripDaoImp implements TripDao{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public List<Trip> getTripsByType(int type) {
		// TODO Auto-generated method stub
		hibernateTemplate.setMaxResults(5);
		List<Trip> trips = (List<Trip>) hibernateTemplate.find("FROM Trip t WHERE t.sequence = " + type);
		System.out.println(trips.get(0).getTitle());
		return trips;
	}

}
