package com.qunawan.DaoImp;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.qunawan.Dao.UserDao;
import com.qunawan.entity.City;
import com.qunawan.entity.User;
import com.qunawan.utils.MD5Utils;

@Repository
public class UserDaoImp implements UserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Autowired
	private SessionFactory SessionFactory;
	@Override
	public boolean isExisted(User user) {
		// TODO Auto-generated method stub
		if (hibernateTemplate.find("FROM User u WHERE u.phone = '" + user.getPhone() + "'").get(0) != null) {
			return true;
		}
		return false;
	}
	@Override
	public boolean passwordCompare(User user) {
		// TODO Auto-generated method stub
		User user2 = (User) hibernateTemplate.find("FROM User u WHERE u.phone = '" + user.getPhone() + "'").get(0);
		if (user2.getPassword().equals(MD5Utils.toMD5(user.getPassword()))) {
			return true;
		}
		return false;
	}
	@Override
	public void updateUser(User user, City city) {
		// TODO Auto-generated method stub
		Session session = SessionFactory.getCurrentSession();
		Query query = session.createQuery("UPDATE User u SET u.name = ?, u.phone = ?, u.email = ?, u.realName=?, u.birthday = ?, u.city = ? WHERE u.id = ?");
		query.setParameter(0, user.getName());
		query.setParameter(1, user.getPhone());
		query.setParameter(2, user.getEmail());
		query.setParameter(3, user.getRealName());
		query.setParameter(4, user.getBirthday());
		query.setParameter(5, city);
		query.setParameter(6, user.getId());
		query.executeUpdate();
	}
	@Override
	public User findUserByPhone(String phone) {
		// TODO Auto-generated method stub
		return (User) hibernateTemplate.find("FROM User u WHERE u.phone = " + phone).get(0);
	}
	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(User.class, id);
	}
	@Override
	public boolean updatePassword(int id, String old_password, String new_password) {
		// TODO Auto-generated method stub
		User user = findUserById(id);
		
		if (user.getPassword().equals(MD5Utils.toMD5(old_password))) {
			user.setPassword(MD5Utils.toMD5(new_password));
			hibernateTemplate.saveOrUpdate(user);
			return true;
		}
		return false;
	}

}
