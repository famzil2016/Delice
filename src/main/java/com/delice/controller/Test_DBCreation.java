package com.delice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.delice.dao.CustomerDao;
import com.delice.dao.HibernateUtils;
import com.delice.dao.Impl.CustomerDaoImpl;
import com.delice.model.Customer;





/**
 * Servlet implementation class Test_DBCreation
 */
@WebServlet("/Test_DBCreation")
public class Test_DBCreation extends HttpServlet {
	private static final long serialVersionUID = 1L;//?

  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// fill in DB for test proposes
		Customer user1;
		//user1.getCustomerByEmail("fatimaamzil93@gmail.com");
		HibernateUtils.getSessionFactory();
		CustomerDao ud1=new CustomerDaoImpl();
		
		user1=ud1.getCustomerByEmail("fatimaamzil93@gmail.com");
		System.out.println(user1.getEmail_customer());
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		}

}
