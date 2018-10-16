package com.hexa.product.repository;

import java.util.List;

import com.hexa.product.domain.Product;

public interface ProductRepository {
	
	List<Product> findAllProducts();
	
	Product findProductById(int id);
}
