package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductDAO {
	Product findById(Integer id);
	List<Product> findAll();
	Product create(Product entity);
	void update(Product entity);
	Product delete(Integer id);
}
