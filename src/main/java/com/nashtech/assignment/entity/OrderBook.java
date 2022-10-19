package com.nashtech.assignment.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.*;


@Entity
@Table(name = "OrderBook")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderBook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OrderID")
	private int orderID;

//	@Column(nullable = false, unique = false)
//	private int customerID;
	@ManyToOne
	@JoinColumn(name = "CustomerID")
	private Customer customer;

//	@Column(nullable = true, unique = false)
//	private int voucherID;
	@ManyToOne
	@JoinColumn(name = "VoucherID")
	private Voucher voucher;
	
//	@Column(nullable = false, unique = false)
//	private int paymentTypeID;
	@ManyToOne
	@JoinColumn(name = "PaymentTypeID")
	private PaymentType paymentType;
	
	@Column(name ="DeliveryAddress", nullable = true, unique = false, length=200)
	private String deliveryAddress;

	@Column(name= "OrderDate", nullable = true, unique = false)
	private Date orderDate;

	@OneToMany(mappedBy = "orderBook")
	private List<OrderBookDetail> orderBookDetails;
	
	
//	public Order (Date orderDate, int customerID, int voucherID, int paymentTypeID, String deliveryAddress) {
//		this.orderDate = orderDate;
//		this.customerID = customerID;
//		this.voucherID = voucherID;
//		this.paymentTypeID = paymentTypeID;
//		this.deliveryAddress = deliveryAddress;
//	}
	
	
}
