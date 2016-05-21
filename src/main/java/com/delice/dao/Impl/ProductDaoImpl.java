package com.delice.dao.Impl;

import java.util.List;

import org.apache.tools.ant.Project;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.delice.dao.HibernateUtils;
import com.delice.dao.ProductDao;
import com.delice.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao{
	private SessionFactory sessionFactory= HibernateUtils.getSessionFactory();
	
	public void setSessionFactory(SessionFactory sf) {
		sessionFactory = sf;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProducts() {
		Session session = sessionFactory.openSession();
		List<Product> products= session.createQuery("from Product").list();
		return products;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProductsByCategory(String name) {

		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		Query q = (Query) s.createQuery("from Product where category.name_category=:name");
		q.setString("name", name);
		List<Product> products = q.list();
		if (products.size() == 0)
			return null;
		return products;	
	}


}