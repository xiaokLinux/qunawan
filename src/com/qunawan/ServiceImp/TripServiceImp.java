package com.qunawan.ServiceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.qunawan.Dao.PriceDao;
import com.qunawan.Dao.TripDao;
import com.qunawan.Dao.TrippictureDao;
import com.qunawan.Service.TripService;
import com.qunawan.entity.Trip;
import com.qunawan.entity.TripBean;
@Service
@Transactional(propagation=Propagation.REQUIRED)
public class TripServiceImp implements TripService {
	@Autowired
	private TripDao tripDao;
	@Autowired
	private TrippictureDao trippictureDao;
	@Autowired
	private PriceDao priceDao;
	@Override
	public List<TripBean> getTripsByType(int type) {
		// TODO Auto-generated method stub
		//获取trips基本信息数组
		List<Trip> trips = tripDao.getTripsByType(type);
		
		List<TripBean> tripBeans = new ArrayList<TripBean>();
		
		for (Trip trip : trips) {
				//获取trip的图片
			TripBean tBean = new TripBean();
			tBean.setTrippictures(trippictureDao.getFirstTrippictureByTrip(trip.getId()));
				//获取价格
			tBean.setPrices(priceDao.getPrices(trip.getId()));
				
			tBean.setTrip(trip);
			tripBeans.add(tBean);
		}
		
		
		return tripBeans;
	}

}
