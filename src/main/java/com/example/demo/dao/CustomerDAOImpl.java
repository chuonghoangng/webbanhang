package com.example.demo.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Customer;
@Transactional
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	SessionFactory factory;
	
	@Override
	public Customer findById(String id) {
		Session session =factory.getCurrentSession();
		Customer entity = session.find(Customer.class, id);
		
		return entity;
	}

	@Override
	public List<Customer> findAll() {
		String hql = "FROM Customer";
		Session session = factory.getCurrentSession();
		TypedQuery<Customer> query = session.createQuery(hql, Customer.class);
		List<Customer> list = query.getResultList();
		return list;

	}

	@Override
	public Customer create(Customer entity) {
		Session session = factory.getCurrentSession();
		session.save(entity);
		return entity;

	}

	@Override
	public void update(Customer entity) {
		Session session = factory.getCurrentSession();
		session.update(entity);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer delete(String id) {
		// TODO Auto-generated method stub
		Session session = factory.getCurrentSession();
		Customer entity = session.find(Customer.class, id);
		session.delete(entity);
		return entity;
	}

}
