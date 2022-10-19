package com.nashtech.assignment.entity;

import javax.persistence.*;

import lombok.*;

import java.util.List;


@Entity
@Table(name = "Category")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CategoryID")
	private int categoryID;
	
	@Column(name = "CategoryName", nullable = true, unique = false, length = 200)
	private String categoryName;
	
	@Column(name = "Description", nullable = true, unique = false)
	private String description;

	@OneToMany(mappedBy = "category")
	private List<Book> books;

	
//	public Category(String categoryName, String description) {
//		this.categoryName = categoryName;
//		this.description = description;
//	}
}
