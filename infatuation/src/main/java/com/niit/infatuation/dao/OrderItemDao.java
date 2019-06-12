package com.niit.infatuation.dao;



import java.util.List;

import com.niit.infatuation.model.OrderItem;



public interface OrderItemDao 
{
	public boolean Saveorupdate(OrderItem orderItems);
	public boolean delete(String orderItem_id);
	public OrderItem get(String orderItem_id);
	public List<OrderItem> getOrderItemsbyOrder(String order_id);
	public List <OrderItem> list();

}
