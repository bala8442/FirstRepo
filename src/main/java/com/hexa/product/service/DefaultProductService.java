package com.hexa.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexa.product.domain.Product;
import com.hexa.product.repository.ProductRepository;

@Service
public class DefaultProductService implements ProductService{
	
	@Autowired
	private ProductRepository productRepo;

	@Override
	public List<Product> getProducts() {
		return productRepo.findAllProducts();
	}

	@Override
	public Product getProductDetails(int id) {
		return productRepo.findProductById(id);
	}

}
