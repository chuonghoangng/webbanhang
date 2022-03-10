package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
@Entity @Table(name="Products")
public class Product {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	String name;
	Double unitPrice;
	String image;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="MM/dd/yyyy")
	Date productDate;
	Boolean available;
	Integer categoryld;
	Integer quantity;
	String description;
	Double discount;
	Integer viewCount;
	Boolean special;
}
