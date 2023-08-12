package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Product;
import com.example.demo.Repository.ProductRepository;

@Service
public class ServiceImpl implements ServiceInterface {
	

    @Autowired

    ProductRepository productRepo;


	@Override
	public Product addProduct(Product product) {
		return productRepo.save(product);

	}


	@Override
	public Product getProductById(long product_id) {
		return productRepo.findById(product_id).get();
	}


	public List<Product> getProductsByPname(String product_name) {
		
		return productRepo.findByProduct_name(product_name);
	}


	@Override
	public List<Product> getProdcutsByPriceRange(double lowPrice, double highprice) {
		
		return productRepo.findByPriceRange(lowPrice, highprice);

	}


	@Override
	public List<Product> getProductsByPriceAsc() {
		
		return productRepo.findByPriceAsc();
	}


	



	

}
