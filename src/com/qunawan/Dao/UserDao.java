package com.qunawan.Dao;

import com.qunawan.entity.City;
import com.qunawan.entity.User;

public interface UserDao {
	public boolean isExisted(User user);
	public boolean passwordCompare(User user);
	public void updateUser(User user, City city);
	public User findUserByPhone(String phone);
	public User findUserById(int id);
	public boolean updatePassword(int id, String old_password, String new_password);
}
