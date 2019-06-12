package com.niit.infatuation.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class ShippingAddr {
private static final long SerialVersionUID=1l;
	
	@Id
	private String shipping_ID;
	private String house_NO;	
	private String country;
	private String city;
	private String localityName;
	private String pin_CODE;
	private String email_ID;
	private String mobile_NO;
	private String first_NAME;
	private String last_NAME;	
	@ManyToOne
	@JoinColumn(name="U_ID")
	User user;
	
	public ShippingAddr() {
		this.shipping_ID = "SHIP"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getShipping_ID() {
		return shipping_ID;
	}
	public void setShipping_ID(String shipping_ID) {
		this.shipping_ID = shipping_ID;
	}
	public String getHouse_NO() {
		return house_NO;
	}
	public void setHouse_NO(String house_NO) {
		this.house_NO = house_NO;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin_CODE() {
		return pin_CODE;
	}
	public void setPin_CODE(String pin_CODE) {
		this.pin_CODE = pin_CODE;
	}
	public String getEmail_ID() {
		return email_ID;
	}
	public void setEmail_ID(String email_ID) {
		this.email_ID = email_ID;
	}
	public String getMobile_NO() {
		return mobile_NO;
	}
	public void setMobile_NO(String mobile_NO) {
		this.mobile_NO = mobile_NO;
	}
	public String getFirst_NAME() {
		return first_NAME;
	}
	public void setFirst_NAME(String first_NAME) {
		this.first_NAME = first_NAME;
	}
	public String getLast_NAME() {
		return last_NAME;
	}
	public void setLast_NAME(String last_NAME) {
		this.last_NAME = last_NAME;
	}

	public String getLocalityName() {
		return localityName;
	}

	public void setLocalityName(String localityName) {
		this.localityName = localityName;
	}

	
		
	
	

}