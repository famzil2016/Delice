package com.delice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.delice.dao.ProductDao;
import com.delice.model.Product;

@Service("ProductService")
@Transactional
public class ProductServiceImpl implements ProductService{
	
	 @Autowired
	 private ProductDao productDao;
	 
	@Override
	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}

	@Override
	public List<Product> getAllProductsByCategory(String name) {
		return productDao.getAllProductsByCategory(name);
	}

	@Override
	public Product getProductById(Long id) {
		return productDao.getProductById(id);
	}

}
