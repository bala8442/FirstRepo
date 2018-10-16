package com.hexa.product.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hexa.product.domain.Product;

@Component
public class ProductRepositoryImpl implements ProductRepository {

	Product p1=new Product(101, "Rice", 100);
	Product p2=new Product(102, "Chocolate", 50);
	Product p3=new Product(101, "Ice cream", 70);
	
	@Override
	public List<Product> findAllProducts() {
		List<Product> products = new ArrayList<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		return products;
	}

	@Override
	public Product findProductById(int id) {
		if(id==p1.getProductID()) {
			return p1;
		}else if(id==p2.getProductID()){
			return p2;
		}else if(id==p3.getProductID()){
			return p3;
		}
		return null;
	}

}
