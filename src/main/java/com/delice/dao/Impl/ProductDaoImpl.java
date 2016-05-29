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

	@Override
	public Product getProductById(Long id) {
		
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		Query q = s.createQuery("from Product where id_product=:id");
		q.setLong("id", id);
		List<Product> prods = q.list();
		if (prods.size() == 0)
			return null;
		return prods.get(0);	}

	@Override
	public List<Product> getShippableProducts(short id) {
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		Query q = (Query) s.createQuery("from Product where shippable_product=:id");
		q.setShort("id",id);
		List<Product> products = q.list();
		if (products.size() == 0)
			return null;
		return products;
	}

	@Override
	public List<Product> getNewestProducts(int limit) {
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		Query q = (Query) s.createQuery("from Product ORDER BY add_date_product DESC");
		q.setMaxResults(4);
		List<Product> products = q.list();
		if (products.size() == 0)
			return null;
		return products;
	}
	
	


}
