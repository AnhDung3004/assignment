package com.nashtech.assignment.entities;

import java.util.Date;

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
public class Discount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int discountID;
	
	@Column(nullable = true, unique = false)
	private int discountPercent;
	
	@Column(nullable = true, unique = false)
	private Date createdDate;
	
	@Column(nullable = true, unique = false)
	private Date modifiedDate;
	
	@Column(nullable = true, unique = false)
	private boolean isActive;
	
	
	public Discount(int discountPercent, Date createdDate, Date modifiedDate, boolean isActive) {
		this.discountPercent = discountPercent;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.isActive = isActive;
	}
}
