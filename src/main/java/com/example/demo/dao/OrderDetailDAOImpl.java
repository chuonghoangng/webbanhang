package com.example.demo.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.OrderDetail;
@Transactional
public class OrderDetailDAOImpl implements OrderDetailDAO {

	@Autowired
	SessionFactory factory;
	
	@Override
	public OrderDetail findById(Integer id) {
		Session session =factory.getCurrentSession();
		OrderDetail entity = session.find(OrderDetail.class, id);
		
		return entity;
	}

	@Override
	public List<OrderDetail> findAll() {
		String hql = "FROM OrderDetail";
		Session session = factory.getCurrentSession();
		TypedQuery<OrderDetail> query = session.createQuery(hql, OrderDetail.class);
		List<OrderDetail> list = query.getResultList();
		return list;

	}

	@Override
	public OrderDetail create(OrderDetail entity) {
		Session session = factory.getCurrentSession();
		session.save(entity);
		return entity;

	}

	@Override
	public void update(OrderDetail entity) {
		Session session = factory.getCurrentSession();
		session.update(entity);
		// TODO Auto-generated method stub
		
	}

	@Override
	public OrderDetail delete(Integer id) {
		// TODO Auto-generated method stub
		Session session = factory.getCurrentSession();
		OrderDetail entity = session.find(OrderDetail.class, id);
		session.delete(entity);
		return entity;
	}

}
