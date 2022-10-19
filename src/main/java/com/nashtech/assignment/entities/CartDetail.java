package com.nashtech.assignment.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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
public class CartDetail {
	@Id
	@Column(nullable = false, unique = false)
	private int cartID;
	
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
