package com.nashtech.assignment.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "Discount")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Discount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DiscountID")
	private int discountID;
	
	@Column(name = "DiscountPercent", nullable = true, unique = false)
	private int discountPercent;
	
	@Column(name = "CreatedDate", nullable = true, unique = false)
	private Date createdDate;
	
	@Column(name = "modifiedDated", nullable = true, unique = false)
	private Date modifiedDate;
	
	@Column(name = "IsActive", nullable = true, unique = false)
	private boolean isActive;

	@OneToMany(mappedBy = "discount")
	private List<Book> books;
	
//	public Discount(int discountPercent, Date createdDate, Date modifiedDate, boolean isActive) {
//		this.discountPercent = discountPercent;
//		this.createdDate = createdDate;
//		this.modifiedDate = modifiedDate;
//		this.isActive = isActive;
//	}
}
