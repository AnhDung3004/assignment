package com.nashtech.assignment.entity;

import javax.persistence.*;

import lombok.*;

import java.util.List;

@Entity
@Table(name = "Author")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AuthorID")
	private int authorID;
	
	@Column(name = "AuthorName", nullable = true, unique = false, length = 200)
	private String authorName;
	
	@Column(name = "Description", nullable = true, unique = false)
	private String description;

	@OneToMany(mappedBy = "author")
	private List<Book> books;
	
//	public Author(String authorName, String description) {
//		this.authorName = authorName;
//		this.description = description;
//	}
}
