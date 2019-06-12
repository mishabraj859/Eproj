package com.niit.infatuation.dao;

import java.util.List;

import com.niit.infatuation.model.User;

public interface UserDao {
	public boolean saveorupdate(User sup);

	public boolean delete(String uid);

	public User get(String uid);

	public List<User> list();
	
	public User isvalidate(String uname,String upwd);
	
	public User getUserEmail(String uname);
}

