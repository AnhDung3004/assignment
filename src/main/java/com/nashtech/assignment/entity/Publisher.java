package com.nashtech.assignment.entity;

import javax.persistence.*;

import lombok.*;

import java.util.List;


@Entity
@Table(name = "Publisher")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Publisher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PublisherID")
	private int publisherID;
	
	@Column(name = "PublisherName", nullable = true, unique = false, length = 200)
	private String publisherName;
	
	@Column(name = "Description", nullable = true, unique = false)
	private String description;

	@OneToMany(mappedBy = "publisher")
	private List<Book> books;
	
//	public Publisher(String publisherName, String description) {
//		this.publisherName = publisherName;
//		this.description = description;
//	}
}
