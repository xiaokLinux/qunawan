package com.qunawan.Action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.qunawan.Service.CityService;
import com.qunawan.Service.UserService;
import com.qunawan.entity.City;
import com.qunawan.entity.Province;
import com.qunawan.entity.User;

@Controller
public class AjaxAction extends ActionSupport {
	@Autowired
	private CityService cityService;
	@Autowired
	private UserService userService;
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public String execute() {
		//获取省份id
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("province"));
		List<City> cities = cityService.getCities(id, 2);
 		setData(JSON.toJSONString(cities));
 		System.out.println(data);
		return SUCCESS;
	}

}
