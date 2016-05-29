package com.delice.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.delice.model.Category;
import com.delice.model.Customer;
import com.delice.model.Passwords;
import com.delice.model.Product;
import com.delice.service.CategoryServiceImpl;
import com.delice.service.CustomerServiceImpl;
import com.delice.service.ProductServiceImpl;

@Controller
@Scope("session")
@SessionAttributes("customer")
public class MainController {

	@Autowired
	private CustomerServiceImpl customerServiceImpl;
	@Autowired
	private ProductServiceImpl productServiceImpl;
	@Autowired
	private CategoryServiceImpl categoryServiceImpl;

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

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public ModelAndView signup(HttpServletRequest request, HttpServletResponse response) {

		Map<String, Map<String, String>> errors = new HashMap<String, Map<String, String>>();
		String output = isOK("", request.getParameter("email_user"));

		if (output.contains("NOT_OK"))
			return new ModelAndView("redirect:/");

		Customer customer = new Customer();
		byte[] salt = Passwords.getNextSalt();
		customer.setEmail_customer(request.getParameter("email_customer"));
		customer.setSalt_customer(salt.toString());
		customer.setPassword_customer(Passwords.MD5(request.getParameter("password_customer")));
		customerServiceImpl.create(customer);
		request.getSession().setAttribute("customer", customer);
		return new ModelAndView("redirect:/profil");
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

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		// first get the user by his email
		Customer customer = customerServiceImpl.getCustomerByEmail(request.getParameter("email_customer").trim());
		if (customer == null)
			return new ModelAndView("redirect:/");
		if (Passwords.MD5(request.getParameter("password_customer").trim())
				.equals(customer.getPassword_customer().trim())) {
			ModelAndView mav = new ModelAndView();
			// mav.addObject("projects", projectDaoImp.getAllProjects());
			mav.addObject("customer", customer);
			mav.setViewName("redirect:/");
			request.getSession().setAttribute("customer", customer);
			return mav;
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session, Model model) {
		session.invalidate();
		if (model.containsAttribute("customer"))
			model.asMap().remove("customer");
		return "redirect:/";
	}

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public ModelAndView listOfProducts(@PathVariable("name") String name) {
		ModelAndView modelAndView = new ModelAndView("services");
		List<Product> products ;
		if(name.equals("les-gourmandises-expediables")){
			short id=1;
			products = productServiceImpl.getShippableProducts(id);
		}else{
			products = productServiceImpl.getAllProductsByCategory(name);
		}
		
		modelAndView.addObject("products", products);
		String cat = categoryServiceImpl.getCategoryName(name);
		modelAndView.addObject("cat", cat);
		return modelAndView;
	}
	
	
	@RequestMapping(value = "/{cat}/{product}/produit", method = RequestMethod.GET)
	public ModelAndView single(@PathVariable("product") String product) {
		ModelAndView modelAndView = new ModelAndView("single");
		Long id = Long.parseLong(product, 10);
		Product item = productServiceImpl.getProductById(id);
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
		int limit=4;
		List<Product> products_new = productServiceImpl.getNewestProducts(limit);
		mav.addObject("newProd1", products_new.get(0));
		mav.addObject("newProd2", products_new.get(1));
		mav.addObject("newProd3", products_new.get(2));
		mav.addObject("newProd4", products_new.get(3));
		mav.setViewName("index");
		return mav;
	}
	

	/*
	 * @RequestMapping(value = "/{cat}/{product}/{name}", method =
	 * RequestMethod.GET) public ModelAndView redirectCat(@PathVariable("name")
	 * String name) { return new ModelAndView("redirect:/{name}"); }
	 */

	@RequestMapping(value = "/catalogue", method = RequestMethod.GET)
	public ModelAndView catalogue() {
		ModelAndView catalogue = new ModelAndView("catalogue");

		List<Category> categories = categoryServiceImpl.getAllCategories();

		catalogue.addObject("categories", categories);
		return catalogue;
	}


	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView redirect(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/galerie-photo", method = RequestMethod.GET)
	public ModelAndView galery(ModelMap pmap) {
		ModelAndView galery = new ModelAndView("galery");

		List<Product> products = productServiceImpl.getAllProducts();

		galery.addObject("products", products);
		return galery;
	}

	@RequestMapping(value = "/nous-somme", method = RequestMethod.GET)
	public String weare(ModelMap pmap) {
		return "weare";
	}

	@RequestMapping(value = "/acceuil", method = RequestMethod.GET)
	public ModelAndView home(ModelMap pmap) {
		return new ModelAndView("redirect:/");
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

	@RequestMapping(value = "/{val1}/{val2}/catalogue", method = RequestMethod.GET)
	public ModelAndView goCatalogue(ModelMap pmap) {
		return new ModelAndView("redirect:/catalogue");
	}

	@RequestMapping(value = "/{val1}/{val2}/galerie-photo", method = RequestMethod.GET)
	public ModelAndView goGallery(ModelMap pmap) {
		return new ModelAndView("redirect:/galerie-photo");
	}

}