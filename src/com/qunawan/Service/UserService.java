package com.qunawan.Service;

import com.qunawan.entity.User;

public interface UserService {
	public User userLogin(User user);
	public void updateUser(User user, int city);
}
