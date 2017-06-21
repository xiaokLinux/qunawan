package com.qunawan.Dao;

import java.util.List;

import com.qunawan.entity.Trip;

public interface TripDao {
	public List<Trip> getTripsByType(int type);
}
