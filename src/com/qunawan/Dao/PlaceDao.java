package com.qunawan.Dao;

import java.util.List;

import com.qunawan.entity.Place;

public interface PlaceDao {
	public List<Place> getHotPlacesByType(int type);
}
