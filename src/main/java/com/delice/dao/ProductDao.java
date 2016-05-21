package com.delice.dao;

import java.util.List;

import com.delice.model.Product;

public interface ProductDao {
	
	
	//public void addProduct(Product product);
    //public void updateProduct(Product product);
    //public Product getProductById(Long id);
    //public void deleteProduct(Long id);
    public List<Product> getAllProducts();
    public List<Product> getAllProductsByCategory(String name);
}
