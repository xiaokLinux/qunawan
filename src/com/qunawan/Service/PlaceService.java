package com.qunawan.Service;

import java.util.List;

import com.qunawan.entity.Place;

public interface PlaceService {
	public List<Place> getHotPlacesByType(int type);
}
