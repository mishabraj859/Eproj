package com.niit.infatuation.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.infatuation.dao.OrderItemDao;
import com.niit.infatuation.model.OrderItem;
@Repository("orderItemDao")
@EnableTransactionManagement
@Transactional
public class OrderItemDaoImpl implements OrderItemDao {
@Autowired
SessionFactory sessionFactory;

	
	public OrderItemDaoImpl(SessionFactory sessionFactory) 
	{
	this.sessionFactory = sessionFactory;
    }

	public boolean Saveorupdate(OrderItem orderItem) {
		sessionFactory.getCurrentSession().saveOrUpdate(orderItem);
		return true;
	}

	public boolean delete(String orderItem_id) {
		OrderItem oi = new OrderItem();
		oi.setOrderItem_ID(orderItem_id);
		sessionFactory.getCurrentSession().delete(oi);
		return true;
		

	}

	public OrderItem get(String orderItem_id) {
		String q1 ="from OrderItem where orderItem_ID='"+orderItem_id+"'";
		Query w = sessionFactory.getCurrentSession().createQuery(q1);
		@SuppressWarnings("unchecked")
		List<OrderItem> list = (List<OrderItem>) w.list();
		if (list == null || list.isEmpty()) {
			return null;
		}
		return list.get(0);

	}

	public List<OrderItem> getOrderItemsbyOrder(String order_id) {
		String q1 ="from OrderItem where order_id='"+order_id+"'";
		Query w = sessionFactory.getCurrentSession().createQuery(q1);
		@SuppressWarnings("unchecked")
		List<OrderItem> list = (List<OrderItem>) w.list();
		if (list == null || list.isEmpty()) {
			return null;
		}
		return list;
	}

	public List<OrderItem> list() {
		@SuppressWarnings("unchecked")
		List<OrderItem> orderitems = (List<OrderItem>) sessionFactory.getCurrentSession().createCriteria(OrderItem.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return orderitems;
	}
}