package com.niit.infatuation.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;



@Entity
@Table
@Component
public class Supplier {
	@Id
	private String sid;
	private String sname;
    private String saddress;
    private String scno;
    private String smail;
    @OneToMany(mappedBy="supplier")
	private List<Product> product;
    
    public Supplier() {
		this.sid ="SUPPLIER"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
    
	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public String getScno() {
		return scno;
	}
	public void setScno(String scno) {
		this.scno = scno;
	}
	public String getSmail() {
		return smail;
	}
	public void setSmail(String smail) {
		this.smail = smail;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
    
    
    
   
    
	
}
