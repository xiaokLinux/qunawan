package com.qunawan.Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.qunawan.Service.CityService;
import com.qunawan.Service.UserService;
import com.qunawan.entity.City;
import com.qunawan.entity.User;

@Controller
public class PersonalAction extends ActionSupport {
	@Autowired
	private CityService cityService;
	@Autowired
	private UserService userService;
	private List<City> provinces;
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<City> getProvinces() {
		return provinces;
	}

	public void setProvinces(List<City> provinces) {
		this.provinces = provinces;
	}

	public String execute() {
		System.out.println("添加初始数据");
		//添加省份数据
		setProvinces(cityService.getCitiesByType(1));
		
		return SUCCESS;
	}
	
	public String update() {
		System.out.println("update.......................");
		User user1 = (User) ActionContext.getContext().getSession().get("user");
		int city = Integer.parseInt(ServletActionContext.getRequest().getParameter("city"));
		user.setId(user1.getId());
		String uString = JSON.toJSONString(user);
		System.out.println(uString);
		userService.updateUser(user, city);
		return SUCCESS;
	}
	
	public void addActionError(String anErrorMessage){
		   String s=anErrorMessage;
		   System.out.println(s);
		  }
		  public void addActionMessage(String aMessage){
		   String s=aMessage;
		   System.out.println(s);
		 
		  }
		  public void addFieldError(String fieldName, String errorMessage){
		   String s=errorMessage;
		   String f=fieldName;
		   System.out.println(s);
		   System.out.println(f);
		 
		  }
	
}
