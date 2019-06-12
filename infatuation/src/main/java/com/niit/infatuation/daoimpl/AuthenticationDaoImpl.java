package com.niit.infatuation.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.infatuation.dao.AuthenticationDao;
import com.niit.infatuation.model.Authentication;

@Repository("authenticationDao")
@EnableTransactionManagement
public class AuthenticationDaoImpl implements AuthenticationDao
{
 @Autowired
 SessionFactory sessionFactory;
 
 public AuthenticationDaoImpl(SessionFactory sessionFactory)
 {
	 this.sessionFactory=sessionFactory;
 }
 @Transactional
 public boolean Saveorupdate(Authentication authentication)
 {
	 sessionFactory.getCurrentSession().saveOrUpdate(authentication);
	 return true;
 }
 
 @Transactional
	public boolean delete(String roleid)
	{
		Authentication a=new Authentication();
		a.setRoleid("roleid");
		sessionFactory.getCurrentSession().delete(a);
		return true;
	}
 @Transactional
	public Authentication get(String roleid)
	{
	    String Sq="From Authentication where roleid+ '" +roleid+ "'";
	    Query q=sessionFactory.getCurrentSession().createQuery(Sq);
	    @SuppressWarnings("unchecked")
	    List<Authentication> list=(List<Authentication>) q.list();
	    if(list==null||list.isEmpty())
	    {
	    	return null;
	    }
	    else
	    {
	    	return list.get(0);
	    }
	}
 
 @Transactional
	public List <Authentication> list()
	{
		return null;
	}
}
