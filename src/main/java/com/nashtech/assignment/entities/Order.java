package com.nashtech.assignment.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderID;
	
	@Column(nullable = true, unique = false)
	private Date orderDate;
	
	@Column(nullable = false, unique = false)
	private int customerID;
	
	@Column(nullable = true, unique = false)
	private int voucherID;
	
	@Column(nullable = false, unique = false)
	private int paymentTypeID;
	
	@Column(nullable = true, unique = false, length=200)
	private String deliveryAddress;
	
	
	public Order (Date orderDate, int customerID, int voucherID, int paymentTypeID, String deliveryAddress) {
		this.orderDate = orderDate;
		this.customerID = customerID;
		this.voucherID = voucherID;
		this.paymentTypeID = paymentTypeID;
		this.deliveryAddress = deliveryAddress;
	}
	
//	@OneToMany(mappedBy = "orderID")
//	List<OrderDetail> listOrderDetail;
	
	
}
