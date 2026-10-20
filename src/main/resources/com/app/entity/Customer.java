package com.app.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name = "email");
	private String email;
	
	public Customer() {
		
	};
	
	

}
