package com.sumanth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumanth.model.Product;
import com.sumanth.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping("/saveProduct")
	public ResponseEntity<?> saveProduct(@RequestBody Product product)
	{
		return new ResponseEntity<>(productService.saveProduct(product),HttpStatus.CREATED);
	}
	
	@RequestMapping("/getAllProducts")
	public ResponseEntity<?> getAllProducts()
	{
		return new ResponseEntity<>(productService.getAllProduct(),HttpStatus.OK);
	}
	
	@GetMapping("/getProduct/{id}")
	public ResponseEntity<?> getProductById(@PathVariable Integer id)
	{
		return new ResponseEntity<>(productService.getProductById(id),HttpStatus.OK);
	}
	
	@GetMapping("/deleteProduct/{id}")
	public ResponseEntity<?> deleteProductById(@PathVariable Integer id)
	{
		return new ResponseEntity<>(productService.deleteProduct(id),HttpStatus.OK);
	}
	
	@PostMapping("/editProduct")
	public ResponseEntity<?> editProduct(@RequestBody Product product)
	{
		return new ResponseEntity<>(productService.saveProduct(product),HttpStatus.OK);
	}
}
