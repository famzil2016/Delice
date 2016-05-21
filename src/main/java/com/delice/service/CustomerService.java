package com.delice.service;

import java.util.List;

import com.delice.model.Customer;

public interface CustomerService {
	 public boolean checkLogin(String customerName, String customerPassword);
	 public List<Customer> getAllCustomers();
	 public void create(Customer entity);
}
