package com.nashtech.assignment.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "CartDetail")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@IdClass(CartDetailCompositeKey.class)
public class CartDetail {
	@Id
//	@Column(nullable = false, unique = false)
//	private int cartID;
	@ManyToOne
	@JoinColumn(name = "CardID")
	private Cart cart;
	
	@Id
//	@Column(nullable = false, unique = false)
//	private int bookID;
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
