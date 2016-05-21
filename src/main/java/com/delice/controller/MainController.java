package com.delice.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.delice.model.Customer;
import com.delice.model.Product;
import com.delice.service.CustomerServiceImpl;
import com.delice.service.ProductServiceImpl;

@Controller
public class MainController {

	@Autowired
	private CustomerServiceImpl customerServiceImpl;

	@Autowired
	private ProductServiceImpl productServiceImpl;

	private String isOK(String input, String email) {
		for (Customer customer : customerServiceImpl.getAllCustomers()) {
			if (customer.getEmail_customer().equals(email)) {
				if (input.isEmpty()) {
					input = "{ \"result\": \"NOT_OK\", \"fields\": {";
				}
				input += " \"email_user\" : \" The " + email + " email is already taken\", ";

			}
		}

		if (input.isEmpty())
			return "{ \"result\": \"OK\" }";
		int pos = input.lastIndexOf(",");
		input = new StringBuilder(input).replace(pos, pos + 1, "").toString();
		input += "}}";
		return input;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView redirect(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String login(HttpServletRequest request, HttpServletResponse response) {

		String output = isOK("", request.getParameter("email_customer"));

		if (output.contains("NOT_OK"))
			return output;

		Customer customer = new Customer();
		customer.setEmail_customer(request.getParameter("email_customer"));
		customer.setPassword_customer(request.getParameter("password_customer"));
		customerServiceImpl.create(customer);
		request.getSession().setAttribute("customer", customer);
		return output;
	}

	@RequestMapping(value = "/profil")
	public ModelAndView homeUser(HttpServletRequest request, HttpServletResponse response) {

		// make sure only connected users access this page
		if (request.getSession().getAttribute("customer") == null) {
			return new ModelAndView("index");
		}

		ModelAndView mav = new ModelAndView();

		// returning the relative view home !
		mav.setViewName("profil");
		return mav;
	} 


	@RequestMapping(value = "/{name:.+}", method = RequestMethod.GET)
	public ModelAndView listOfProducts(@PathVariable("name") String name) {
		ModelAndView modelAndView = new ModelAndView("services");

		List<Product> products = productServiceImpl.getAllProductsByCategory(name);
		if (products.size() == 0)
			return new ModelAndView("403");

		modelAndView.addObject("products", products);
		return modelAndView;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET) 
	public ModelAndView index(ModelMap pmap) {
		return new ModelAndView("index");
	}

	@RequestMapping(value = "/weare", method = RequestMethod.GET)
	public String weare(ModelMap pmap) {
		return "weare";
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String home(ModelMap pmap) {
		return "index";
	}

	@RequestMapping(value = "/galery", method = RequestMethod.GET)
	public String galery(ModelMap pmap) {
		return "galery";
	}

	@RequestMapping(value = "/mail", method = RequestMethod.GET)
	public String mail(ModelMap pmap) {
		return "mail";
	}

	/*
	 * @RequestMapping(value = "/profil", method = RequestMethod.GET) public
	 * ModelAndView profil(ModelMap pmap) { return new
	 * ModelAndView("redirect:/"); }
	 */

	@RequestMapping(value = "/checkout", method = RequestMethod.GET)
	public String checkout(ModelMap pmap) {
		return "checkout";
	}

}