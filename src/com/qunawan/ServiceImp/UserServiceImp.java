package com.qunawan.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.opensymphony.xwork2.ActionContext;
import com.qunawan.Dao.CityDao;
import com.qunawan.Dao.UserDao;
import com.qunawan.Service.UserService;
import com.qunawan.entity.City;
import com.qunawan.entity.User;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class UserServiceImp implements UserService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private CityDao cityDao;
	@Override
	public User userLogin(User user) {
		// TODO Auto-generated method stub
		if (userDao.isExisted(user) && userDao.passwordCompare(user)) {
			System.out.println(user.getPhone());
			return userDao.findUserByPhone(user.getPhone());
		}
		return null;
	}
	@Override
	public void updateUser(User user, int city) {
		// TODO Auto-generated method stub
		City c = cityDao.getCityById(city);
		userDao.updateUser(user, c);
	}

}
