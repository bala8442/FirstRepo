package com.hexa.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hexa.product.domain.Product;
import com.hexa.product.service.ProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@RestController
@Api(value="Product Resources")
public class ProductResource {
	
	@Autowired
	private ProductService productService;

	@ApiOperation(value="Get all products")
	@GetMapping("/products")
	public List<Product> getProducts(){		
		return productService.getProducts();
	}
	
	@ApiOperation(value="Get a product")
	@GetMapping("/products/{id}")
	public Product getProductDetails(@PathVariable int id){		
		return productService.getProductDetails(id);
	}
}
