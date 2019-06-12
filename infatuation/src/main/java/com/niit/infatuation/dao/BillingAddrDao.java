package com.niit.infatuation.dao;


import java.util.List;

import com.niit.infatuation.model.BillingAddr;



public interface BillingAddrDao 
{
	public boolean Saveorupdate(BillingAddr billingAddr);
	public boolean delete(String billin_id);
	public BillingAddr get(String u_id);
	public List <BillingAddr> list();
}
