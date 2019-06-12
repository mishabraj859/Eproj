package com.niit.infatuation.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.infatuation.dao.CardDao;
import com.niit.infatuation.model.Card;
import com.niit.infatuation.model.Category;

@Repository("cardDao")
@EnableTransactionManagement
@Transactional
public class CardDaoImpl implements CardDao {
	@Autowired 
	public SessionFactory sessionFactory;
	
	
	public CardDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public boolean delete(String card_ID){
		Card card =new Card();
		card.setCard_ID(card_ID);
		sessionFactory.getCurrentSession().delete(card);

		
			return true;

	}

	public Card get(String cart_ID){
		System.out.println(cart_ID);
		String hql="from Category where CARD_ID ='"+cart_ID +"'";
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		List<Card> list1 = (List<Card>)q.list();
		if(list1 ==null || list1.isEmpty())
		{
		
			return null;
		}else{
			return list1.get(0);
		}
		
	}
	
	public List<Card> getcardbyuser(String u_id){
		System.out.println(u_id);
		String hql="from Card where U_ID ='"+u_id+"'";
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		List<Card> list1 = (List<Card>)q.list();
		if(list1 ==null || list1.isEmpty())
		{
		
			return null;
		}else{
			return list1;
		}
		
	}
	
	@Transactional
	public List<Card> list()
	{
		@SuppressWarnings("unchecked")
		List<Card> listcard=(List<Card>)sessionFactory.getCurrentSession().createCriteria(Card.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
			return listcard;
		}
	
	@Transactional
	public boolean Saveorupdate(Card card){
		sessionFactory.getCurrentSession().saveOrUpdate(card);
		return true;

		}

//
//	@Override
//	public boolean Saveorupdate(Card card) {
//		// TODO Auto-generated method stub
//		return false;
//	}



	}
