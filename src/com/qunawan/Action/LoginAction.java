package com.qunawan.Action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.qunawan.Service.UserService;
import com.qunawan.entity.User;
@Controller
public class LoginAction extends ActionSupport {
	@Autowired
	private UserService userService;
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String execute() {
		setUser(userService.userLogin(user));
		if (user != null) {			
			ActionContext.getContext().getSession().put("user", user);
			return SUCCESS;
		}
		return INPUT;
	}
}
