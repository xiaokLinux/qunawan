package com.qunawan.Dao;

import java.util.List;

import com.qunawan.entity.Trippicture;

public interface TrippictureDao {
	public List<Trippicture> getFirstTrippictureByTrip(int trip_id);
}
