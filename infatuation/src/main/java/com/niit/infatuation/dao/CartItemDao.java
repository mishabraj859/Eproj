package com.niit.infatuation.dao;

import java.util.List;

import com.niit.infatuation.model.CartItem;

public interface CartItemDao {
	
public boolean Save(CartItem CartItem);

	public boolean delete(String cartItem_Id);

	public List<CartItem> getlistbyproId(String  p_id);
	public CartItem get(String cartItem_Id);
	public List<CartItem> getlist(String  CartId);
	public List<CartItem> list();
}
