package com.niit.infatuation.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.infatuation.dao.SupplierDao;
import com.niit.infatuation.model.Supplier;

@Repository("supplierDao")
@EnableTransactionManagement
public class SupplierDaoImpl implements SupplierDao {
	@Autowired
	private SessionFactory sessionFactory;


	public SupplierDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean saveorupdate(Supplier sup) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(sup);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean delete(String cid) {

		Supplier sup = new Supplier();
//		sup.getSid();
		sup.setSid(cid);
		sessionFactory.getCurrentSession().delete(sup);
		return true;
	}
	@Transactional
	public boolean delete2(Supplier sup) {

		sessionFactory.getCurrentSession().delete(sup);
		return true;
	}

	@Transactional
	public Supplier get(String sid) 
	{
		String q3= "from Supplier where sid='"+sid+"'";
		Query w2=sessionFactory.getCurrentSession().createQuery(q3);
		@SuppressWarnings("unchecked")
		List<Supplier> list2=(List<Supplier>)w2.list();
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
	public List<Supplier> list() 
	{
		@SuppressWarnings("unchecked")
		List<Supplier> supplier = (List<Supplier>)sessionFactory.getCurrentSession().createCriteria(Supplier.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return supplier;
	}

}
