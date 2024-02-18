package com.sumanth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumanth.model.Product;
import com.sumanth.repository.ProductRepository;

@Service
public class ProductServiceImp implements ProductService{

	@Autowired
	private ProductRepository productRepo;
	@Override
	public Product saveProduct(Product product) {
		return productRepo.save(product);
		// TODO Auto-generated method stub
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public Product getProductById(Integer id) {
		return productRepo.findById(id).get();
		// TODO Auto-generated method stub
		
	}

	@Override
	public String deleteProduct(Integer id){
		Product product = productRepo.findById(id).get();
		if(product!=null)
		{
			productRepo.delete(product);
			return "Product Deleted Succesfully";
		}
		return "something went wrong";
		
	}
}
