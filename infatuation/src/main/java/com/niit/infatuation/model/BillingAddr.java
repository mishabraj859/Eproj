package com.niit.infatuation.model;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.niit.infatuation.model.User;

@Entity
@Table
@Component
public class BillingAddr {
	private static final long SerialVersionUID=1l;
	
	@Id
	private String billing_ID;
	private String house_NO;
	private String countary;
	private String city;
	private String pin_CODE;
	private String LocalityName;
	private String email_ID;
	private String mobile_NO;
	@OneToOne
	@JoinColumn(name="u_ID")
	User user;
	
	public BillingAddr() {
		
		this.billing_ID = "BIL"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}

	public String getBilling_ID() {
		return billing_ID;
	}

	public void setBilling_ID(String billing_ID) {
		this.billing_ID = billing_ID;
	}

	public String getHouse_NO() {
		return house_NO;
	}

	public void setHouse_NO(String house_NO) {
		this.house_NO = house_NO;
	}

	public String getCountary() {
		return countary;
	}

	public void setCountary(String countary) {
		this.countary = countary;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getLocalityName() {
		return LocalityName;
	}

	public void setLocalityName(String localityName) {
		LocalityName = localityName;
	}
	

}