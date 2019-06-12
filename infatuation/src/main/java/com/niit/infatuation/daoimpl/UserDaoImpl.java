package com.niit.infatuation.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.infatuation.dao.UserDao;
import com.niit.infatuation.model.Authentication;
import com.niit.infatuation.model.User;

@Repository("UserDao")
@EnableTransactionManagement
@SuppressWarnings("unchecked")
public class UserDaoImpl implements UserDao {
	@Autowired
	SessionFactory sessionFactory;


	public UserDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean saveorupdate(User use) {
		try {
			Authentication authentication=new Authentication();
			authentication.setUsername(use.getUmail());
			use.getBilling().setUser(use);
			use.getBilling().setMobile_NO(use.getUcno());
			use.getBilling().setEmail_ID(use.getUmail());
			sessionFactory.getCurrentSession().saveOrUpdate(use.getBilling());
			sessionFactory.getCurrentSession().saveOrUpdate(authentication);
			sessionFactory.getCurrentSession().saveOrUpdate(use);
			sessionFactory.getCurrentSession().saveOrUpdate(use.getCart());
			
			
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean delete(String uid) {

		User use = new User();
		use.setUid(uid);
		sessionFactory.getCurrentSession().delete(use);
		return true;
	}

	@Transactional
	public User get(String uid) 
	{
		String q4= "from User where uid='"+uid+ "'";
		Query w3=sessionFactory.getCurrentSession().createQuery(q4);
		List<User> list2=(List<User>)w3.list();
		if(list2==null || list2.isEmpty())
		{
			return null;
		}
		else
		{
		  return list2.get(0);
		}
	}
 
	@Transactional
	public List<User> list() 
	{
//		@SuppressWarnings("unchecked")
		List<User> user = (List<User>)sessionFactory.getCurrentSession().createCriteria(User.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return user;
	}
	
	@Transactional
	public User isvalidate(String umail,String upwd)
	{
		String q5= "from User where umail='"+umail+"'and upwd='"+upwd+"'";
		Query w4=sessionFactory.getCurrentSession().createQuery(q5);
				List<User> list9=(List<User>)w4.list();
		if(list9==null || list9.isEmpty())
		{
			return null;
		}
		else
		{
		  return list9.get(0);
		}
	}

	@Transactional
	public User getUserEmail(String umail)
	{
		String q="From User where umail='"+umail+"'";
		Query w= sessionFactory.getCurrentSession().createQuery(q);
		@SuppressWarnings("unchecked")
		List<User> list=(List<User>)w.list();
		if(list==null||list.isEmpty())
		{
		return null;
		}
		return list.get(0);
		
	}

}

