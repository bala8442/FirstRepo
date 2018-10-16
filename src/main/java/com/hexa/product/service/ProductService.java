package com.hexa.product.service;

import java.util.List;

import com.hexa.product.domain.Product;

public interface ProductService {

	List<Product> getProducts();
	
	Product getProductDetails(int id);
}
