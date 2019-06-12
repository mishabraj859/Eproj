package com.niit.infatuation.dao;

import java.util.List;

import com.niit.infatuation.model.Supplier;

public interface SupplierDao {
	public boolean saveorupdate(Supplier sup);

	public boolean delete(String sid);

	public Supplier get(String sid);

	public List<Supplier> list();
	public boolean delete2(Supplier sup);
}
