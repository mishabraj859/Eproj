package com.niit.infatuation.dao;

import java.util.List;

import com.niit.infatuation.model.Category;

public interface CategoryDao {
	public boolean saveorupdate(Category cat);

	public boolean delete(String cid);

	public Category get(String cid);

	public List<Category> list();
}
