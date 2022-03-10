package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity @Table(name="Categories")
public class Category {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	String name;
	String nameVN;
	
}
