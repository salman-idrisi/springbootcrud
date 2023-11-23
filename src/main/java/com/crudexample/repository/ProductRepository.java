package com.crudexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudexample.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	Product findByName(String name);
	
}
