package com.nashtech.assignment.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail {
	@Id
	@Column(nullable = false, unique = false)
//	@ManyToOne
//	@JoinColumn(name = "orderID", referencedColumnName = "orderID")
	private int orderID;
	
	@Id
	@Column(nullable = false, unique = false)
	private int bookID;
	
	@Column(nullable = true, unique = false)
	private int quantity;

	@Column(nullable = true, unique = false)
	private double costPreDiscount;

	@Column(nullable = true, unique = false)
	private double costAfterDiscount;
	
	
}
