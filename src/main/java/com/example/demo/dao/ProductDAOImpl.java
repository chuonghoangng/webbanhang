package com.example.demo.dao;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

//import com.example.demo.entity.Product;
import com.example.demo.entity.Product;
@Transactional
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	SessionFactory factory;
	
	@Override
	public Product findById(Integer id) {
		Session session =factory.getCurrentSession();
		Product entity = session.find(Product.class, id);
		
		return entity;
	}

	@Override
	public List<Product> findAll() {
		String hql = "FROM Product";
		Session session = factory.getCurrentSession();
		TypedQuery<Product> query = session.createQuery(hql, Product.class);
		List<Product> list = query.getResultList();
		return list;

	}

	@Override
	public Product create(Product entity) {
		Session session = factory.getCurrentSession();
		session.save(entity);
		return entity;

	}

	@Override
	public void update(Product entity) {
		Session session = factory.getCurrentSession();
		session.update(entity);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product delete(Integer id) {
		// TODO Auto-generated method stub
		Session session = factory.getCurrentSession();
		Product entity = session.find(Product.class, id);
		session.delete(entity);
		return entity;
	}
}
