package com.niit.infatuation.dao;

import java.util.List;

import com.niit.infatuation.model.Pay;


public interface PayDao 
{
	public boolean Saveorupdate(Pay pay);
	public boolean delete(String pay_id);
	public Pay get(String pay_id);
	public List <Pay> list();
}
