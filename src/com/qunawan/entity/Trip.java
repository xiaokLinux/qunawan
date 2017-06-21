package com.qunawan.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Trip entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "trip", catalog = "qunawan")
public class Trip implements java.io.Serializable {

	// Fields

	private Integer id;
	private City city;
	private Sequence sequence;
	private Position position;
	private Integer num;
	private String title;
	private String STitle;
	private String traffic;
	private String hotel;
	private Integer time;
	private float goodRate;
	private float placeScore;
	private float hotelScore;
	private float serviceScore;
	private float trafficScore;
	private boolean isOk;
	private Set<Orders> orderses = new HashSet<Orders>(0);
	private Set<Trippicture> trippictures = new HashSet<Trippicture>(0);
	private Set<Schedule> schedules = new HashSet<Schedule>(0);
	private Set<Orders> orderses_1 = new HashSet<Orders>(0);
	private Set<Detail> details = new HashSet<Detail>(0);
	private Set<Comment> comments = new HashSet<Comment>(0);
	private Set<Themeontrip> themeontrips = new HashSet<Themeontrip>(0);
	private Set<Price> prices = new HashSet<Price>(0);
	private Set<Placeontrip> placeontrips = new HashSet<Placeontrip>(0);
	private Set<Comment> comments_1 = new HashSet<Comment>(0);

	// Constructors

	/** default constructor */
	public Trip() {
	}

	/** minimal constructor */
	public Trip(City city, Sequence sequence, Position position, Integer num,
			String title, String STitle) {
		this.city = city;
		this.sequence = sequence;
		this.position = position;
		this.num = num;
		this.title = title;
		this.STitle = STitle;
	}

	/** full constructor */
	public Trip(City city, Sequence sequence, Position position, Integer num,
			String title, String STitle, String traffic, String hotel,
			Integer time, float goodRate, float placeScore, float hotelScore,
			float serviceScore, float trafficScore, boolean isOk,
			Set<Orders> orderses, Set<Trippicture> trippictures,
			Set<Schedule> schedules, Set<Orders> orderses_1,
			Set<Detail> details, Set<Comment> comments,
			Set<Themeontrip> themeontrips, Set<Price> prices,
			Set<Placeontrip> placeontrips, Set<Comment> comments_1) {
		this.city = city;
		this.sequence = sequence;
		this.position = position;
		this.num = num;
		this.title = title;
		this.STitle = STitle;
		this.traffic = traffic;
		this.hotel = hotel;
		this.time = time;
		this.goodRate = goodRate;
		this.placeScore = placeScore;
		this.hotelScore = hotelScore;
		this.serviceScore = serviceScore;
		this.trafficScore = trafficScore;
		this.isOk = isOk;
		this.orderses = orderses;
		this.trippictures = trippictures;
		this.schedules = schedules;
		this.orderses_1 = orderses_1;
		this.details = details;
		this.comments = comments;
		this.themeontrips = themeontrips;
		this.prices = prices;
		this.placeontrips = placeontrips;
		this.comments_1 = comments_1;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "start_place", nullable = false)
	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "type", nullable = false)
	public Sequence getSequence() {
		return this.sequence;
	}

	public void setSequence(Sequence sequence) {
		this.sequence = sequence;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "position", nullable = false)
	public Position getPosition() {
		return this.position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	@Column(name = "num", nullable = false)
	public Integer getNum() {
		return this.num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	@Column(name = "title", nullable = false, length = 100)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "s_title", nullable = false, length = 10)
	public String getSTitle() {
		return this.STitle;
	}

	public void setSTitle(String STitle) {
		this.STitle = STitle;
	}

	@Column(name = "traffic", length = 20)
	public String getTraffic() {
		return this.traffic;
	}

	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}

	@Column(name = "hotel", length = 20)
	public String getHotel() {
		return this.hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	@Column(name = "time")
	public Integer getTime() {
		return this.time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	@Column(name = "good_rate", precision = 5, scale = 1)
	public float getGoodRate() {
		return this.goodRate;
	}

	public void setGoodRate(float goodRate) {
		this.goodRate = goodRate;
	}

	@Column(name = "place_score", precision = 5, scale = 1)
	public float getPlaceScore() {
		return this.placeScore;
	}

	public void setPlaceScore(float placeScore) {
		this.placeScore = placeScore;
	}

	@Column(name = "hotel_score", precision = 5, scale = 1)
	public float getHotelScore() {
		return this.hotelScore;
	}

	public void setHotelScore(float hotelScore) {
		this.hotelScore = hotelScore;
	}

	@Column(name = "service_score", precision = 5, scale = 1)
	public float getServiceScore() {
		return this.serviceScore;
	}

	public void setServiceScore(float serviceScore) {
		this.serviceScore = serviceScore;
	}

	@Column(name = "traffic_score", precision = 5, scale = 1)
	public float getTrafficScore() {
		return this.trafficScore;
	}

	public void setTrafficScore(float trafficScore) {
		this.trafficScore = trafficScore;
	}

	@Column(name = "is_ok")
	public boolean getIsOk() {
		return this.isOk;
	}

	public void setIsOk(boolean isOk) {
		this.isOk = isOk;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "trip")
	public Set<Orders> getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set<Orders> orderses) {
		this.orderses = orderses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "trip")
	public Set<Trippicture> getTrippictures() {
		return this.trippictures;
	}

	public void setTrippictures(Set<Trippicture> trippictures) {
		this.trippictures = trippictures;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "trip")
	public Set<Schedule> getSchedules() {
		return this.schedules;
	}

	public void setSchedules(Set<Schedule> schedules) {
		this.schedules = schedules;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "trip")
	public Set<Orders> getOrderses_1() {
		return this.orderses_1;
	}

	public void setOrderses_1(Set<Orders> orderses_1) {
		this.orderses_1 = orderses_1;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "trip")
	public Set<Detail> getDetails() {
		return this.details;
	}

	public void setDetails(Set<Detail> details) {
		this.details = details;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "trip")
	public Set<Comment> getComments() {
		return this.comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "trip")
	public Set<Themeontrip> getThemeontrips() {
		return this.themeontrips;
	}

	public void setThemeontrips(Set<Themeontrip> themeontrips) {
		this.themeontrips = themeontrips;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "trip")
	public Set<Price> getPrices() {
		return this.prices;
	}

	public void setPrices(Set<Price> prices) {
		this.prices = prices;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "trip")
	public Set<Placeontrip> getPlaceontrips() {
		return this.placeontrips;
	}

	public void setPlaceontrips(Set<Placeontrip> placeontrips) {
		this.placeontrips = placeontrips;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "trip")
	public Set<Comment> getComments_1() {
		return this.comments_1;
	}

	public void setComments_1(Set<Comment> comments_1) {
		this.comments_1 = comments_1;
	}

}