package com.qunawan.Service;

import java.util.List;


import com.qunawan.entity.TripBean;

public interface TripService {
	public List<TripBean> getTripsByType(int type);
}
