package com.qunawan.DaoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.qunawan.Dao.PlaceDao;
import com.qunawan.entity.Place;
@Repository
public class PlaceDaoImp implements PlaceDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public List<Place> getHotPlacesByType(int type) {
		// TODO Auto-generated method stub
		hibernateTemplate.setMaxResults(10);
		List<Place> places = (List<Place>) hibernateTemplate.find("SELECT DISTINCT p FROM Placeontrip pt LEFT JOIN pt.place p LEFT JOIN pt.trip t " + "WHERE t.sequence = " + type + " ORDER BY 'place_score' DESC");
		System.out.println(places.size());
		return places;
	}

}
