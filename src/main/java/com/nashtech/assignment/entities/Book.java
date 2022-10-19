package com.nashtech.assignment.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookID;
	
	@Column(nullable = false, unique = false)
	private int categoryID;
	
	@Column(nullable = false, unique = false)
	private int publisherID;
	
	@Column(nullable = false, unique = false)
	private int authorID;
	
	@Column(nullable = true, unique = false, length = 200)
	private String bookName;
	
	@Column(nullable = true, unique = false)
	private Date publishedDate;
	
	@Column(nullable = true, unique = false)
	private String summary;
	
	@Column(nullable = true, unique = false, length=200)
	private String imageUrl;
	
	@Column(nullable = false, unique = false)
	private double price;
	
	@Column(nullable = true, unique = false)
	private int discountID;
	
	@Column(nullable = false, unique = false)
	private int quantity;
	
	@Column(nullable = true, unique = false)
	private Date createdDate;
	
	@Column(nullable = true, unique = false)
	private Date modifiedDate;
	
	@Column(nullable = true, unique = false)
	private boolean isActive;
	
	
//	public Book(int categoryID, int publisherId, int authorID, String bookName, Date publishedDate, String summary,
//			String imageUrl, double price, int discountID, int quantity, Date createdDate, Date modifiedDate, boolean isActive) {
//		this.categoryID = categoryID;
//		this.publisherID = publisherId;
//		this.authorID = authorID;
//		this.bookName = bookName;
//		this.publishedDate = publishedDate;
//		this.summary = summary;
//		this.imageUrl = imageUrl;
//		this.price = price;
//		this.discountID = discountID;
//		this.quantity = quantity;
//		this.createdDate = createdDate;
//		this.modifiedDate = modifiedDate;
//		this.isActive = isActive;
//	}
	
}
