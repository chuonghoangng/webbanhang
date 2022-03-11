package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Order;

public interface OrderDAO {
	Order findById(Integer id);
	List<Order> findAll();
	Order create(Order entity);
	void update(Order entity);
	Order delete(Integer id);

}
