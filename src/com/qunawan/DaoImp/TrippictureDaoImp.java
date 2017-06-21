package com.qunawan.DaoImp;

import java.util.HashSet;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.qunawan.Dao.TrippictureDao;
import com.qunawan.entity.Trippicture;
@Repository
public class TrippictureDaoImp implements TrippictureDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public List<Trippicture> getFirstTrippictureByTrip(int trip_id) {
		// TODO Auto-generated method stub
		List<Trippicture> trippictures = (List<Trippicture>) hibernateTemplate.find("FROM Trippicture p WHERE p.trip = " + trip_id + "AND p.type = 0");
		System.out.println(trippictures.get(0).getName());
		return trippictures;
	}

}
