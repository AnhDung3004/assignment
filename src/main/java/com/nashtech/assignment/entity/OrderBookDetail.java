package com.nashtech.assignment.entity;

import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "OrderBookDetail")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@IdClass(OrderDetailCompositeKey.class)
public class OrderBookDetail {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int orderID;
	@Id
	@ManyToOne
	@JoinColumn(name = "OrderID")
	private OrderBook orderBook;

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int bookID;
	@Id
	@ManyToOne
	@JoinColumn(name = "BookID")
	private Book book;


	@Column(name = "Quantity", nullable = true, unique = false)
	private int quantity;

	@Column(name = "CostPreDiscount", nullable = true, unique = false)
	private double costPreDiscount;

	@Column(name = "CostAfterDiscount", nullable = true, unique = false)
	private double costAfterDiscount;
	
	
}
