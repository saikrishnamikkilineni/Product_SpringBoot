package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Product;

import com.example.demo.Service.ServiceImpl;

@RestController
public class Controller {

	
	 @Autowired
	    ServiceImpl serviceInterface;

	    @PostMapping("/addProduct")
	    public Product addProduct(@RequestBody Product product) {

	        

	        serviceInterface.addProduct(product); 
	        

	        

	        return product;

	    }
	    
	    
	    @GetMapping("/getProductById")
	    public Product getProductById(@RequestBody Product product) {
	    	return serviceInterface.getProductById(product.getProduct_id());
	    }
	    
	    @GetMapping("/getProductsByPname")
	    public List<Product> getProductByPname(@RequestBody Product product) {
	    	return serviceInterface.getProductsByPname(product.getProduct_name());
	    }
	    
	    @GetMapping("/getProdcutsByPriceRange")
	    public List<Product> getProductsByPriceRange() {
	    	return serviceInterface.getProdcutsByPriceRange( 100, 400);
	    }
	    
	    @GetMapping("/getProductsByPriceAsc")
	    public List<Product> getProductsByPriceAsc() {
	    	return serviceInterface.getProductsByPriceAsc(); 
	    }
}

