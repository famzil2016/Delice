package com.delice.service;

import java.util.List;

import com.delice.model.Customer;

public interface CustomerService {
	 public Customer getCustomerByEmail(String email);
	 public List<Customer> getAllCustomers();
	 public void create(Customer entity);
}
