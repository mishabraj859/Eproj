package com.niit.infatuation.model;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="User")
@Component
public class User {
	public static final long SerialVersionUID=1l;
	
	@Id
	private String uid;
	private String uname;
    private String upwd;
    private String uaddress;
    private String umail;
    private String ucno;
    private String role="ROLE_USER";
    @OneToOne 
    @JoinColumn(name="CartId") 
    private Cart cart;

    @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="billing_ID") 
    private BillingAddr billing;
      
    public User() {
		this.uid ="USER"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	public String getUmail() {
		return umail;
	}

	public void setUmail(String umail) {
		this.umail = umail;
	}

	public String getUcno() {
		return ucno;
	}

	public void setUcno(String ucno) {
		this.ucno = ucno;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public BillingAddr getBilling() {
		return billing;
	}

	public void setBilling(BillingAddr billing) {
		this.billing = billing;
	}
	
	
	
}
