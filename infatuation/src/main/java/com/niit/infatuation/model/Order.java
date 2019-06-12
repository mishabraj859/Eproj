package com.niit.infatuation.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "Orders")
@Component
public class Order {
	private static final DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static final DateFormat dtf = new SimpleDateFormat("HH:mm:ss");
	private static final long SerialVersionUID = 1l;
	@Id
	private String order_ID;
	private double grand_TOTAL;

	@OneToOne
	@JoinColumn(name = "billing_ID")
	BillingAddr billingAddr;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shipping_ID")
	ShippingAddr shippingAddr;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pay_ID")
	Pay pay;

	@OneToOne
	@JoinColumn(name = "U_ID")
	User user;

	private String orderdate;
	private String ordertime;

	@OneToMany(mappedBy = "order")
	List<OrderItem> OrderItems;

	public Order() {
		Date date = new Date();
		orderdate = sdf.format(date);
		Calendar cal = Calendar.getInstance();
		Date date1 = new Date();
		ordertime = dtf.format(date1);

		this.order_ID = "OR" + UUID.randomUUID().toString().substring(30).toUpperCase();
	}

	public String getOrder_ID() {
		return order_ID;
	}

	public void setOrder_ID(String order_ID) {
		this.order_ID = order_ID;
	}

	public double getGrand_TOTAL() {
		return grand_TOTAL;
	}

	public void setGrand_TOTAL(double grand_TOTAL) {
		this.grand_TOTAL = grand_TOTAL;
	}

	public BillingAddr getBillingAddress() {
		return billingAddr;
	}

	public void setBillingAddress(BillingAddr billingAddr) {
		this.billingAddr = billingAddr;
	}

	public ShippingAddr getShippingAddr() {
		return shippingAddr;
	}

	public void setShippingAddress(ShippingAddr shippingAddress) {
		this.shippingAddr = shippingAddress;
	}

	public Pay getPay() {
		return pay;
	}

	public void setPay(Pay pay) {
		this.pay = pay;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public BillingAddr getBillingAddr() {
		return billingAddr;
	}

	public void setBillingAddr(BillingAddr billingAddr) {
		this.billingAddr = billingAddr;
	}

	public List<OrderItem> getOrderItems() {
		return OrderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		OrderItems = orderItems;
	}

	public void setShippingAddr(ShippingAddr shippingAddr) {
		this.shippingAddr = shippingAddr;
	}

}