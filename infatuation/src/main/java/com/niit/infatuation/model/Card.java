package com.niit.infatuation.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.niit.infatuation.model.User;

@Entity
@Table
@Component
public class Card {
	private static final long SerialVersionUID=1l;
	
	@Id
	private String card_ID;
	private String card_number;
	private String card_holderName;
	private String card_ExpiryDate;
	@ManyToOne
	@JoinColumn(name="U_ID")
	private User user;
	public Card() {
		
		this.card_ID = "CARD"+UUID.randomUUID().toString().substring(30).toUpperCase();

	}
	public String getCard_ID() {
		return card_ID;
	}
	public void setCard_ID(String card_ID) {
		this.card_ID = card_ID;
	}
	public String getCard_number() {
		return card_number;
	}
	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}
	public String getCard_holderName() {
		return card_holderName;
	}
	public void setCard_holderName(String card_holderName) {
		this.card_holderName = card_holderName;
	}
	public String getCard_ExpiryDate() {
		return card_ExpiryDate;
	}
	public void setCard_ExpiryDate(String card_ExpiryDate) {
		this.card_ExpiryDate = card_ExpiryDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

}