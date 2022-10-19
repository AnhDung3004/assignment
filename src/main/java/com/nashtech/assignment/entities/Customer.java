package com.nashtech.assignment.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerID;
	
	@Column(nullable = true, unique = false)
	private int accountID;
	
	@Column(nullable = true, unique = false, length=100)
	private String customerName;
	
	@Column(nullable = true, unique = false, length=10)
	private String phone;
	
	@Column(nullable = true, unique = false, length=200)
	private String address;
	
	
	public Customer (int accountID, String customerName, String phone, String address) {
		this.accountID = accountID;
		this.customerName = customerName;
		this.phone = phone;
		this.address = address;
	}
}
