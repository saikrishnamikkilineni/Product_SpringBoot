package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Product;

public interface ServiceInterface {
	
	public Product addProduct(Product product);
	public Product getProductById(long product_id);
	public List<Product> getProductsByPname(String product_name);
	 public List<Product> getProdcutsByPriceRange(double lowPrice, double highprice);
     public List<Product> getProductsByPriceAsc();
	 
}
