package com.qunawan.Test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.interceptor.annotations.Before;
import com.qunawan.Service.TripService;
import com.qunawan.entity.TripBean;

public class DatabaseTest {
	@Autowired
	private TripService tripService;
	@Before
	@Test
	public void Test() {
		List<TripBean> tripBeans = tripService.getTripsByType(2);
		System.out.println(tripBeans.get(0).getTrip().getTitle());
	}
}
