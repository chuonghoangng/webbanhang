package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Customer;

public interface CustomerDAO {
	Customer findById(String id);
	List<Customer> findAll();
	Customer create(Customer entity);
	void update(Customer entity);
	Customer delete(String id);

}
