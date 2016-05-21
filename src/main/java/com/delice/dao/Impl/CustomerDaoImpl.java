package com.delice.dao.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.delice.dao.CustomerDao;
import com.delice.dao.HibernateUtils;
import com.delice.model.Customer;



@Repository
public class CustomerDaoImpl implements CustomerDao {
	private SessionFactory sessionFactory= HibernateUtils.getSessionFactory();
	
	public void setSessionFactory(SessionFactory sf) {
		sessionFactory = sf;
	}
	
	@Override
	@Transactional
	public void create(Customer entity) {
		
		Session s = com.delice.dao.HibernateUtils.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		try {

			s.persist(entity); //To save the user: Make a transient instance persistent.
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}finally {
			s.close();
		}

	}

	/*@Override
	public void update(Customer entity) {
		
		// Session s = HibernateUtils.getSessionFactory().openSession();
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		try {
				s.update(entity);
				tx.commit();
			} catch (Exception e) {
				tx.rollback();
			} finally {
				s.close();
			}
		
	}

	@Override
	public void delete(Customer entity) {
		// Session s = HibernateUtils.getSessionFactory().openSession();
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		try {
				s.delete(entity);
				tx.commit();
			} catch (Exception e) {
				tx.rollback();
			} finally {
				s.close();
			}
		
	}

	@Override
	public Customer getCustomerById(long id) {
		Customer user = null;
		// Session s = HibernateUtils.getSessionFactory().openSession();
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		try {
			user = s.get(Customer.class, id);
			// user= s.byId( User.class ).load( id );
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			s.close();
		}
		return user;
	}

	@Override
	public Customer getCustomerByName(String name) {
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		Query q = s.createQuery("from User u where u.name_user=:name");
		q.setString("name", name);
		List<Customer> users = q.list();
		if (users.size() == 0)
			return null;
		return users.get(0);
	}

	@Override
	public Customer getCustomerByEmail(String email) {
		Session s = sessionFactory.openSession();
		Query q = s.createQuery("from User u where u.email_user=:email");
		q.setString("email", email);
		List<Customer> users = q.list();
		if (users.size() == 0)
			return null;
		return users.get(0);
		

	}

	@Override
	public List<Customer> getAllCustomers() {
		Session session = sessionFactory.openSession();
		// return session.createCriteria(User.class).list();
		@SuppressWarnings("unchecked")
		List<Customer> ulist = session.createQuery("from User").list();
		return  ulist;
	}*/
	
	@Override
	public Customer getCustomerByEmail(String email) {
		Session s = sessionFactory.openSession();
		Query q = s.createQuery("from Customer c where c.email_customer=:email");
		q.setString("email", email);
		List<Customer> users = q.list();
		if (users.size() == 0)
			return null;
		return users.get(0);
	}
	
	@Override
	public List<Customer> getAllCustomers(){
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Customer> clist = session.createQuery("from Customer").list();
		return clist;
	}

	@Override
	public boolean checkLogin(String customerName, String customerPassword) {
		System.out.println("In Check login");
		Session session = sessionFactory.openSession();
		boolean userFound = false;
		//Query using Hibernate Query Language
		String SQL_QUERY =" from Customer as c where c.name_customer=? and c.password_customer=?";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0,customerName);
		query.setParameter(1,customerPassword);
		List list = query.list();

		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}

		session.close();
		return userFound;       
	}
	
	

}
