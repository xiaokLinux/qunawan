package com.qunawan.Service;

import com.qunawan.entity.User;

public interface UserService {
	public User userLogin(User user);
	public void updateUser(User user, int city);
	public boolean updatePassword(int id, String old_password, String new_password);
}
