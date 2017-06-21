package com.qunawan.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qunawan.Dao.PlaceDao;
import com.qunawan.Service.PlaceService;
import com.qunawan.entity.Place;
@Service
public class PlaceServiceImp implements PlaceService {
	@Autowired
	private PlaceDao placeDao;
	@Override
	public List<Place> getHotPlacesByType(int type) {
		// TODO Auto-generated method stub
		return placeDao.getHotPlacesByType(type);
	}

}
