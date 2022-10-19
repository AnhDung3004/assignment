package com.nashtech.assignment.entity;

import javax.persistence.*;

import lombok.*;

import java.util.List;

@Entity
@Table(name = "Customer")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CustomerID")
	private int customerID;
	
//	@Column(nullable = true, unique = false)
//	private int accountID;

	@ManyToOne
	@JoinColumn(name = "AccountID")
	private  Account account;
	
	@Column(name = "CustomerName", nullable = true, unique = false, length=100)
	private String customerName;
	
	@Column(name = "Phone", nullable = true, unique = false, length=10)
	private String phone;
	
	@Column(name = "Address", nullable = true, unique = false, length=200)
	private String address;

	@OneToMany(mappedBy = "customer")
	private List<OrderBook> orderBooks;
	
	
//	public Customer (int accountID, String customerName, String phone, String address) {
//		this.accountID = accountID;
//		this.customerName = customerName;
//		this.phone = phone;
//		this.address = address;
//	}
}
