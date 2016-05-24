package com.delice.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tools.ant.Project;
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

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public ModelAndView listOfProducts(@PathVariable("name") String name) {
		ModelAndView modelAndView = new ModelAndView("services");

		List<Product> products = productServiceImpl.getAllProductsByCategory(name);
		if (products.size() == 0)
			return new ModelAndView("403");
		
		modelAndView.addObject("products", products);
		String cat= name ;
		modelAndView.addObject("cat", cat );
		return modelAndView;
	}
	

	@RequestMapping(value = "/{cat}/{product}/single", method = RequestMethod.GET)
	public ModelAndView single(@PathVariable("product") String product) {
		ModelAndView modelAndView = new ModelAndView("single");
		Long id=Long.parseLong(product, 10);
		Product item=productServiceImpl.getProductById(id);
		modelAndView.addObject("item", item);
		return modelAndView;
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(ModelMap pmap) {
		List<Product> products = productServiceImpl.getAllProducts();

		ModelAndView mav = new ModelAndView();
		// all projects
		mav.addObject("product1", products.get(new Random().nextInt(products.size())));
		mav.addObject("product2", products.get(new Random().nextInt(products.size())));
		mav.addObject("product3", products.get(new Random().nextInt(products.size())));

		mav.setViewName("index");
		return mav;
	}
	


	@RequestMapping(value = "/nous-somme", method = RequestMethod.GET)
	public String weare(ModelMap pmap) {
		return "weare";
	}

	@RequestMapping(value = "acceuil", method = RequestMethod.GET)
	public ModelAndView home(ModelMap pmap) {
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/galerie-photo", method = RequestMethod.GET)
	public ModelAndView galery(ModelMap pmap) {
		ModelAndView galery = new ModelAndView("galery");

		List<Product> products = productServiceImpl.getAllProducts();
		if (products.size() == 0)
			return new ModelAndView("403");

		galery.addObject("products", products);
		return galery;
	}

	@RequestMapping(value = "/mail", method = RequestMethod.GET)
	public String mail(ModelMap pmap) {
		return "mail";
	}


	@RequestMapping(value = "/checkout", method = RequestMethod.GET)
	public String checkout(ModelMap pmap) {
		return "checkout";
	}
	
	@RequestMapping(value = "/{val1}/{val2}/acceuil", method = RequestMethod.GET)
	public ModelAndView goHome(ModelMap pmap) {
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/{val1}/{val2}/nous-somme", method = RequestMethod.GET)
	public ModelAndView goWeare(ModelMap pmap) {
		return new ModelAndView("redirect:/nous-somme");
	}
	
	@RequestMapping(value = "/{val1}/{val2}/galerie-photo", method = RequestMethod.GET)
	public ModelAndView goGallery(ModelMap pmap) {
		return new ModelAndView("redirect:/galerie-photo");
	}
	
	
}