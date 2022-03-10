package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
@Entity @Table(name="Orders")
public class Order {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	String customerld;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="MM/dd/yyyy")
	Date orderDate;
	String address;
	Double amount;
	String description;

}
