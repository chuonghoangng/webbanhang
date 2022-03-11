package com.example.demo.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Order;
@Transactional
public class OrderDAOImpl implements OrderDAO {

	@Autowired
	SessionFactory factory;
	
	@Override
	public Order findById(Integer id) {
		Session session =factory.getCurrentSession();
		Order entity = session.find(Order.class, id);
		
		return entity;
	}

	@Override
	public List<Order> findAll() {
		String hql = "FROM Order";
		Session session = factory.getCurrentSession();
		TypedQuery<Order> query = session.createQuery(hql, Order.class);
		List<Order> list = query.getResultList();
		return list;

	}

	@Override
	public Order create(Order entity) {
		Session session = factory.getCurrentSession();
		session.save(entity);
		return entity;

	}

	@Override
	public void update(Order entity) {
		Session session = factory.getCurrentSession();
		session.update(entity);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Order delete(Integer id) {
		// TODO Auto-generated method stub
		Session session = factory.getCurrentSession();
		Order entity = session.find(Order.class, id);
		session.delete(entity);
		return entity;
	}

}
