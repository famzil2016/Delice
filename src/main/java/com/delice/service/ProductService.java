package com.delice.service;

import java.util.List;

import com.delice.model.Product;

public interface ProductService {
	
	
	//public void addProduct(Product product);
    //public void updateProduct(Product product);
    //public Product getProductById(Long id);
    //public void deleteProduct(Long id);
    public List<Product> getAllProducts();
    public List<Product> getAllProductsByCategory(String name);
    public Product getProductById(Long id);
    public List<Product> getShippableProducts(short id);
    public List<Product> getNewestProducts(int limit);
}
