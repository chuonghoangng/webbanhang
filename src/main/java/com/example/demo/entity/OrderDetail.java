package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
@Entity @Table(name="OrderDetails")
public class OrderDetail {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)

	Integer id;
	Integer orderld;
	Integer productld;
	Double unitPrice;
	Integer quantity;
	Double discount;

}
