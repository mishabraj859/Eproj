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
public class OrderItem {
private static final long SerialVersionUID=1l;
	
	
	@Id
	private String orderItem_ID;
	
	@ManyToOne
	@JoinColumn(name="order_ID")
	private Order order;
	
	private String pro_ID;

	public OrderItem() {
		this.orderItem_ID = "BIL"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}

	public String getOrderItem_ID() {
		return orderItem_ID;
	}

	public void setOrderItem_ID(String orderItem_ID) {
		this.orderItem_ID = orderItem_ID;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getPro_ID() {
		return pro_ID;
	}

	public void setPro_ID(String pro_ID) {
		this.pro_ID = pro_ID;
	}


}
