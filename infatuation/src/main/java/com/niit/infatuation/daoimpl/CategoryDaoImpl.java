package com.niit.infatuation.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.infatuation.dao.CategoryDao;
import com.niit.infatuation.model.Category;

@Repository("categoryDao")
@EnableTransactionManagement
public class CategoryDaoImpl implements CategoryDao {
	@Autowired
	private SessionFactory sessionFactory;

	public CategoryDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean saveorupdate(Category cat) {
		sessionFactory.getCurrentSession().saveOrUpdate(cat);
		return true;
	}

	@Transactional
	public boolean delete(String cid) {
		sessionFactory.getCurrentSession().delete(get(cid));
		return true;
	}

	@Transactional
	public Category get(String cid) {
		String q1 = "from Category where cid='"+cid+"'";
		Query w = sessionFactory.getCurrentSession().createQuery(q1);
		@SuppressWarnings("unchecked")
		List<Category> list1 = (List<Category>) w.list();
		if (list1 == null || list1.isEmpty()) {
			return null;
		} else {
			return list1.get(0);
		}
	}

	@Transactional
	public List<Category> list() {
		@SuppressWarnings("unchecked")
		List<Category> category = (List<Category>) sessionFactory.getCurrentSession().createCriteria(Category.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return category;
	}

}
