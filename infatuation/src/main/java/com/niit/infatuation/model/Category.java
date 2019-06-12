package com.niit.infatuation.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Category {
	@Id
	private String cid;
	private String cname;
	@OneToMany(mappedBy="category")
	private List<Product> product;
     
	public Category() {
		this.cid ="CATEGORY"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	
	
	
	
	

}
