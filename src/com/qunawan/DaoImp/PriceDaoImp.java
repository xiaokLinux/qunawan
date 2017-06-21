package com.qunawan.DaoImp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.qunawan.Dao.PriceDao;
import com.qunawan.entity.Price;
@Repository
public class PriceDaoImp implements PriceDao {
	@Autowired
	public HibernateTemplate hibernateTemplate;
	@Override
	public List<Price> getPrices(int trip_id) {
		// TODO Auto-generated method stub
		List<Price> prices = (List<Price>) hibernateTemplate.find("FROM Price p WHERE p.trip = " + trip_id + "ORDER BY 'date' DESC");
		System.out.println(prices.get(0).getPrice());
		return prices;
	}

}
