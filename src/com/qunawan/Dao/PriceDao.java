package com.qunawan.Dao;

import java.util.List;

import com.qunawan.entity.Price;

public interface PriceDao {
	public List<Price> getPrices(int trip_id);
}
