package com.example.deltacore.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.deltacore.Entity.Products;
import com.example.deltacore.Repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	
	
	public List<Products> getProducts(){
		return productRepository.findAll();
	}

	}
	

