package com.niit.infatuation.dao;

import java.util.List;

import com.niit.infatuation.model.ShippingAddr;

public interface ShippingAddrDao {
		public boolean Saveorupdate(ShippingAddr shippingAddress);
		public boolean delete(String shippin_id);
		public ShippingAddr get(String shippin_id);
		public List<ShippingAddr> getaddbyuser(String u_id);
		public List <ShippingAddr> list();
	}

