package com.delice.dao;

import java.util.List;

import com.delice.model.Customer;

public interface CustomerDao {
	
	public void create(Customer entity);

	//public void update(Customer entity);

	//public void delete(Customer entity);

	//public Customer getCustomerById(long id);

	//public Customer getCustomerByName(String name);

	//public Customer getCustomerByEmail(String email);

	//public List<Customer> getAllCustomers();
	
	public Customer getCustomerByEmail(String email);
	public List<Customer> getAllCustomers();
	public boolean checkLogin(String customerName, String customerPassword);

}
