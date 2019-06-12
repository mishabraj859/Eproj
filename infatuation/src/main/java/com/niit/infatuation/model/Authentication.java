package com.niit.infatuation.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="Authentication")
@Component
public class Authentication
{
	
	private static final long SerialVersionUID=1l;
	@Id
	private String roleid;
	private String role_name="ROLE_USER";
	private String username;
	public Authentication()
	{
		this.roleid="ROLE"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	public String getRoleid() {
		return roleid;
	}
	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}
	
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
 
}
