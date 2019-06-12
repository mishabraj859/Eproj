package com.niit.infatuation.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Pay {
private static final long SerialVersionUID=1l;
	
	@Id
	private String pay_ID;
	private String pay_MAY;
	private String pay_STATUS;
	
	public Pay() {
		this.pay_ID = "PAY"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}

	public String getPay_ID() {
		return pay_ID;
	}

	public void setPay_ID(String pay_ID) {
		this.pay_ID = pay_ID;
	}

	public String getPay_MAY() {
		return pay_MAY;
	}

	public void setPay_MAY(String pay_MAY) {
		this.pay_MAY = pay_MAY;
	}

	public String getPay_STATUS() {
		return pay_STATUS;
	}

	public void setPay_STATUS(String pay_STATUS) {
		this.pay_STATUS = pay_STATUS;
	}
	
	
	
	

}