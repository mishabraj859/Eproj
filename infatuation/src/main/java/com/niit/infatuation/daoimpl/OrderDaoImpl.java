package com.niit.infatuation.daoimpl;

	import java.util.List;

	import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
	import org.springframework.transaction.annotation.EnableTransactionManagement;
	import org.springframework.transaction.annotation.Transactional;

import com.niit.infatuation.dao.OrderDao;
import com.niit.infatuation.model.Order;

	@Repository("orderDao")
	@EnableTransactionManagement
	public class OrderDaoImpl implements OrderDao {
		@Autowired 
		public SessionFactory sessionFactory;
		
		
		public OrderDaoImpl(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}
		@Transactional
		public boolean Saveorupdate(Order order){
			sessionFactory.getCurrentSession().saveOrUpdate(order);
			return true;
		}
		
		@Transactional
		public boolean delete(String order_ID){
			Order OR =new Order();
			OR.setOrder_ID(order_ID);
			sessionFactory.getCurrentSession().delete(OR);

			
				return true;

		}
		@Transactional
		public Order get(String order_ID){
			System.out.println(order_ID);
			String hql="from Order where O_ID ='"+order_ID +"'";
			Query q = sessionFactory.getCurrentSession().createQuery(hql);
			List<Order> list1 = (List<Order>)q.list();
			if(list1 ==null || list1.isEmpty())
			{
			
				return null;
			}else{
				return list1.get(0);
			}
			
		}
		@Transactional
		public List<Order> list(){
			@SuppressWarnings("unchecked")
			List<Order>listorder=(List<Order>)sessionFactory.getCurrentSession().createCriteria(Order.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			
				return listorder;
			}
	
		}