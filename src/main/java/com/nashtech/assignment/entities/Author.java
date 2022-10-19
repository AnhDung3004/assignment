package com.nashtech.assignment.entities;

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
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int authorID;
	
	@Column(nullable = true, unique = false, length = 200)
	private String authorName;
	
	@Column(nullable = true, unique = false)
	private String description;
	
	
//	public Author(String authorName, String description) {
//		this.authorName = authorName;
//		this.description = description;
//	}
}
