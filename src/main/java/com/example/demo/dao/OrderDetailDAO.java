package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.OrderDetail;

public interface OrderDetailDAO {
	OrderDetail findById(Integer id);
	List<OrderDetail> findAll();
	OrderDetail create(OrderDetail entity);
	void update(OrderDetail entity);
	OrderDetail delete(Integer id);

}
