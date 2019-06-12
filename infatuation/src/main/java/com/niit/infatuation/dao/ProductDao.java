package com.niit.infatuation.dao;

import java.util.List;

import com.niit.infatuation.model.Product;

public interface ProductDao {
	public boolean saveorupdate(Product pro);

	public boolean delete(String pid);

	public Product get(String pid);

	public List<Product> list();
	public boolean delete2(Product product);
}
