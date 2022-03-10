package com.example.demo.entity;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity @Table(name="Customers")
public class Customer {
	@Id 
	String id;
	String password;
	String fullname;
	String email;
	String photo;
	Boolean activated;
	Boolean admin;
}
