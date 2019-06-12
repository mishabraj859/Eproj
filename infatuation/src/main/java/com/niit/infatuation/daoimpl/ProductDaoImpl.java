package com.niit.infatuation.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.infatuation.dao.ProductDao;
import com.niit.infatuation.model.Product;

@Repository("productDao")
@EnableTransactionManagement
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory1;
	public ProductDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory1= sessionFactory;
	}

	@Transactional
	public boolean saveorupdate(Product pro) {
		
		sessionFactory1.getCurrentSession().saveOrUpdate(pro);
		return true;
	}

	@Transactional
	public boolean delete(String pid) {
		System.out.println(pid);
		Product pro = new Product();
		pro.setPid(pid);
		sessionFactory1.getCurrentSession().delete(pro);
		return true;
	}


	@Transactional
	public Product get(String pid) 
	{
		String q2= "from Product where pid='"+pid+"'";
		Query w1=sessionFactory1.getCurrentSession().createQuery(q2);
		@SuppressWarnings("unchecked")
		List<Product> list2=(List<Product>)w1.list();
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
	public Product getcat(String id) 
	{
		String q2= "from Product where cat_id='"+id+"'";
		Query w1=sessionFactory1.getCurrentSession().createQuery(q2);
		@SuppressWarnings("unchecked")
		List<Product> list2=(List<Product>)w1.list();
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
	public List<Product> list() 
	{
		@SuppressWarnings("unchecked")
		List<Product> product = (List<Product>)sessionFactory1.getCurrentSession().createCriteria(Product.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return product;
	}
	
	
	public boolean delete2(Product product)
	{
		try {
			sessionFactory1.getCurrentSession().delete(product);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

}
