package com.nashtech.assignment.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "Book")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BookID")
	private int bookID;

//	@Column(nullable = false, unique = false)
//	private int categoryID;
	@ManyToOne
	@JoinColumn(name = "CategoryID")
	private Category category;

//	@Column(nullable = false, unique = false)
//	private int publisherID;
	@ManyToOne
	@JoinColumn(name = "PublisherID")
	private Publisher publisher;

//	@Column(nullable = false, unique = false)
//	private int authorID;
	@ManyToOne
	@JoinColumn(name = "AuthorID")
	private Author author;

	@Column(name = "BookName", nullable = true, unique = false, length = 200)
	private String bookName;
	
	@Column(name = "PublishedDate", nullable = true, unique = false)
	private Date publishedDate;
	
	@Column(name = "Summary", nullable = true, unique = false)
	private String summary;
	
	@Column(name = "ImageUrl", nullable = true, unique = false, length=200)
	private String imageUrl;
	
	@Column(name = "Price", nullable = false, unique = false)
	private double price;
	

	
	@Column(name = "Quantity", nullable = false, unique = false)
	private int quantity;
	
	@Column(name = "CreatedDate", nullable = true, unique = false)
	private Date createdDate;
	
	@Column(name = "ModifiedDate", nullable = true, unique = false)
	private Date modifiedDate;
	
	@Column(name = "IsActive", nullable = true, unique = false)
	private boolean isActive;

	//	@Column(nullable = true, unique = false)
//	private int discountID;
	@ManyToOne
	@JoinColumn(name = "DiscountID")
	private Discount discount;

	@OneToMany(mappedBy = "book")
	private List<OrderBookDetail> orderBookDetails;

	@OneToMany(mappedBy = "book")
	private List<CartDetail> cartDetails;

	@OneToMany(mappedBy = "book")
	private  List<Comment> comments;
	
	
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
