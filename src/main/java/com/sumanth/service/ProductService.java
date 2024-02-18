package com.sumanth.service;

import java.util.List;

import com.sumanth.model.Product;
public interface ProductService {
	public Product saveProduct(Product product);
	public List<Product> getAllProduct();
	public Product getProductById(Integer id);
	public String deleteProduct(Integer id);
	
	
}
