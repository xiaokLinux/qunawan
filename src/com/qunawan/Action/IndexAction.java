package com.qunawan.Action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.qunawan.Service.PlaceService;
import com.qunawan.Service.ThemeService;
import com.qunawan.Service.TripService;
import com.qunawan.entity.Place;
import com.qunawan.entity.Theme;
import com.qunawan.entity.Trip;
import com.qunawan.entity.TripBean;
import com.qunawan.entity.User;

import freemarker.template.utility.Execute;
@Controller
public class IndexAction extends ActionSupport {
	@Autowired
	private TripService tripService;
	@Autowired
	private PlaceService placeService;
	@Autowired
	private ThemeService themeService;
	private User user;
	private List<TripBean> trips;
	private List<TripBean> inter_trips;
	private List<TripBean> self_trips;
	private List<Place> places;
	private List<Place> inter_places;
	private List<Place> self_places;
	private List<Theme> themes;
	private List<Theme> inter_themes;
	private List<Theme> self_themes;
	public List<Theme> getThemes() {
		return themes;
	}

	public void setThemes(List<Theme> themes) {
		this.themes = themes;
	}

	public List<Theme> getInter_themes() {
		return inter_themes;
	}

	public void setInter_themes(List<Theme> inter_themes) {
		this.inter_themes = inter_themes;
	}

	public List<Theme> getSelf_themes() {
		return self_themes;
	}

	public void setSelf_themes(List<Theme> self_themes) {
		this.self_themes = self_themes;
	}

	public List<Place> getSelf_places() {
		return self_places;
	}

	public void setSelf_places(List<Place> self_places) {
		this.self_places = self_places;
	}

	public List<Place> getInter_places() {
		return inter_places;
	}

	public void setInter_places(List<Place> inter_places) {
		this.inter_places = inter_places;
	}

	public List<Place> getPlaces() {
		return places;
	}

	public void setPlaces(List<Place> places) {
		this.places = places;
	}

	public List<TripBean> getSelf_trips() {
		return self_trips;
	}

	public void setSelf_trips(List<TripBean> self_trips) {
		this.self_trips = self_trips;
	}

	public List<TripBean> getInter_trips() {
		return inter_trips;
	}

	public void setInter_trips(List<TripBean> inter_trips) {
		this.inter_trips = inter_trips;
	}

	public List<TripBean> getTrips() {
		return trips;
	}

	public void setTrips(List<TripBean> trips) {
		this.trips = trips;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String execute() {
		//添加景点简介
		setTrips(tripService.getTripsByType(2));
		setInter_trips(tripService.getTripsByType(3));
		setSelf_trips(tripService.getTripsByType(1));
		
		//添加热门景点导航
		setPlaces(placeService.getHotPlacesByType(2));
		setInter_places(placeService.getHotPlacesByType(3));
		setSelf_places(placeService.getHotPlacesByType(1));
		
		//添加热门主题
		setThemes(themeService.getHotThemesByType(2));
		setInter_themes(themeService.getHotThemesByType(3));
		setSelf_themes(themeService.getHotThemesByType(1));
		
		//ActionContext.getContext().getSession().put("id", user.getId());
		return SUCCESS;
	}
}
