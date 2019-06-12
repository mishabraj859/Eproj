package com.niit.infatuation.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.infatuation.dao.ShippingAddrDao;
import com.niit.infatuation.model.ShippingAddr;

@Repository("shippingAddrDao")
@EnableTransactionManagement
public class ShippingAddrDaoImpl implements ShippingAddrDao {
	@Autowired
	SessionFactory sessionFactory;

	public  ShippingAddrDaoImpl(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}

	@Transactional
	public boolean Saveorupdate(ShippingAddr shippingAddr) {
		sessionFactory.getCurrentSession().saveOrUpdate(shippingAddr);
		return true;
	}

	@Transactional
	public boolean delete(String shipping_ID) {
		ShippingAddr SA = new ShippingAddr();
		SA.setShipping_ID(shipping_ID);
		sessionFactory.getCurrentSession().delete(SA);

		return true;

	}

	@Transactional
	public ShippingAddr get(String shipping_ID) {
		System.out.println(shipping_ID);
		String hql = "from Category where SA_ID ='" + shipping_ID + "'";
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		List<ShippingAddr> list1 = (List<ShippingAddr>) q.list();
		if (list1 == null || list1.isEmpty()) {

			return null;
		} else {
			return list1.get(0);
		}

	}

	@Transactional
	public List<ShippingAddr> list() {
		@SuppressWarnings("unchecked")
		List<ShippingAddr> lists = (List<ShippingAddr>) sessionFactory.getCurrentSession()
				.createCriteria(ShippingAddr.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return lists;
	}

	@Transactional
	public List<ShippingAddr> getaddbyuser(String u_id) {
		String hql = "from ShippingAddr where U_ID='"+ u_id +"'";
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		List<ShippingAddr> list1 = (List<ShippingAddr>) q.list();
		if (list1 == null || list1.isEmpty()) {

			return null;
		} else {
			return list1;

		}

	}

}
