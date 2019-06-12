package com.niit.infatuation.daoimpl;



	import java.util.List;

	import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
	import org.springframework.transaction.annotation.EnableTransactionManagement;
	import org.springframework.transaction.annotation.Transactional;

import com.niit.infatuation.dao.PayDao;
import com.niit.infatuation.model.Pay;



	@Repository("payDao")
	@EnableTransactionManagement
	public class PayDaoImpl implements PayDao {
		@Autowired 
		public SessionFactory sessionFactory;	
		
		public PayDaoImpl(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}
		
		
		
		@Transactional
		public boolean Saveorupdate(Pay pay){
			sessionFactory.getCurrentSession().saveOrUpdate(pay);
			return true;
			
		}
		@Transactional
		public boolean delete(String pay_ID){
			Pay PAY =new Pay();
			PAY.setPay_ID(pay_ID);
			sessionFactory.getCurrentSession().delete(PAY);
			
				return true;
			
		}
		@Transactional
		public Pay get(String pay_ID){
			System.out.println(pay_ID);
			String hql="from Pay where PAY_ID ='"+pay_ID +"'";
			Query q = sessionFactory.getCurrentSession().createQuery(hql);
			List<Pay> list1 = (List<Pay>)q.list();
			if(list1 ==null || list1.isEmpty())
			{
			
				return null;
			}else{
				return list1.get(0);
			}
			
		}
		@Transactional
		public List<Pay> list(){
			@SuppressWarnings("unchecked")
			List<Pay>listp=(List<Pay>)sessionFactory.getCurrentSession().createCriteria(Pay.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			
				return listp;
			}



	
			
		}
