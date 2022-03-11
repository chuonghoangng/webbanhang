package com.example.demo.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Category;
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	SessionFactory factory;
	
	@Override
	public Category findById(Integer id) {
		Session session =factory.getCurrentSession();
		Category entity = session.find(Category.class, id);
		
		return entity;
	}

	@Override
	public List<Category> findAll() {
		String hql = "FROM Category";
		Session session = factory.getCurrentSession();
		TypedQuery<Category> query = session.createQuery(hql, Category.class);
		List<Category> list = query.getResultList();
		return list;

	}

	@Override
	public Category create(Category entity) {
		Session session = factory.getCurrentSession();
		session.save(entity);
		return entity;

	}

	@Override
	public void update(Category entity) {
		Session session = factory.getCurrentSession();
		session.update(entity);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Category delete(Integer id) {
		// TODO Auto-generated method stub
		Session session = factory.getCurrentSession();
		Category entity = session.find(Category.class, id);
		session.delete(entity);
		return entity;
	}

}
