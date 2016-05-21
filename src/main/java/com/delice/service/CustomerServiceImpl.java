package com.delice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.delice.dao.CustomerDao;
import com.delice.model.Customer;

@Service("CustomerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	 @Autowired
	 private CustomerDao customerDAO;
	 
	 
	 public void setLoginDAO(CustomerDao customerDAO) {
         this.customerDAO = customerDAO;
  }
 
	@Override
	public boolean checkLogin(String customerName, String customerPassword) {
	
		System.out.println("In Service class...Check Login");
        return customerDAO.checkLogin(customerName, customerPassword);
	}

	@Override
	public List<Customer> getAllCustomers() {
		System.out.println("In Service class...Check getting all customers");
        return customerDAO.getAllCustomers();
	}

	@Override
	public void create(Customer entity) {
		customerDAO.create(entity);
	}
	
	

}
