package com.qunawan.entity;

import java.util.List;

public class TripBean {
	private Trip trip;
	private List<Trippicture> trippictures;
	private List<Price> prices;
	public Trip getTrip() {
		return trip;
	}
	public void setTrip(Trip trip) {
		this.trip = trip;
	}
	public List<Trippicture> getTrippictures() {
		return trippictures;
	}
	public void setTrippictures(List<Trippicture> trippictures) {
		this.trippictures = trippictures;
	}
	public List<Price> getPrices() {
		return prices;
	}
	public void setPrices(List<Price> prices) {
		this.prices = prices;
	}
	
	
}
