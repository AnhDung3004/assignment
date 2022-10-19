package com.nashtech.assignment.entities;

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
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryID;
	
	@Column(nullable = true, unique = false, length = 200)
	private String categoryName;
	
	@Column(nullable = true, unique = false)
	private String description;
	
	
	public Category(String categoryName, String description) {
		this.categoryName = categoryName;
		this.description = description;
	}
}
