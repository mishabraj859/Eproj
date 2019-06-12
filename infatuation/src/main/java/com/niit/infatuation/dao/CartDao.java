package com.niit.infatuation.dao;

import java.util.List;

import com.niit.infatuation.model.Cart;

public interface CartDao 
{
	public boolean saveupdate(Cart cart);
    public boolean delete(String CartId);
	public Cart get(String CartId);
	public List<Cart> list();
}
