package com.niit.infatuation.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.infatuation.dao.BillingAddrDao;
import com.niit.infatuation.model.BillingAddr;



@Repository("billingDao")
@EnableTransactionManagement
public class BillingAddrDaoImpl implements BillingAddrDao {
	@Autowired 
    SessionFactory sessionFactory;
	
	
	public BillingAddrDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
    @Transactional	
    public boolean Saveorupdate(BillingAddr billingAddr){
    	sessionFactory.getCurrentSession().saveOrUpdate(billingAddr);
		return true;
				
	}

    @Transactional
    public boolean delete(String billing_id){
    	BillingAddr BILL =new BillingAddr();
    	BILL.setBilling_ID(billing_id);
    	sessionFactory.getCurrentSession().delete(BILL);
    	
    		return true;
		
	}
    
    @Transactional
    public BillingAddr get(String uid){
    	System.out.println(uid);
    	String bl="from BillingAddress where uid ='"+uid+"'";
    	Query q = sessionFactory.getCurrentSession().createQuery(bl);
    	@SuppressWarnings("unchecked")
    	List<BillingAddr> list1 = (List<BillingAddr>)q.list();
    	if(list1 ==null || list1.isEmpty())
    	{
    	
    		return null;
    	}else{
    		return list1.get(0);
    	}

		
	}
    @Transactional
    public List <BillingAddr> list(){
    	@SuppressWarnings("unchecked")
    	List<BillingAddr>listbl=(List<BillingAddr>)sessionFactory.getCurrentSession().createCriteria(BillingAddr.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
    	
    		return listbl;
    	}

}
