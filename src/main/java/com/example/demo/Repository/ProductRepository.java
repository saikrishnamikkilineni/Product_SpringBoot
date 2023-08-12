package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Product;



	@Repository
	public interface ProductRepository extends JpaRepository<Product, Long> 
	{

		 @Query(value="select * from Product where product_name=?1",nativeQuery = true)

		    List<Product> findByProduct_name(String product_name);

		 @Query(value="select * from Product where product_price between ?1 and ?2",nativeQuery = true)

		    List<Product> findByPriceRange(double lowPrice, double highPrice);
		
		 @Query(value="select * from Product order by product_price",nativeQuery = true)

		    List<Product> findByPriceAsc();
		
}

