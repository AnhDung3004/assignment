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
public class Publisher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int publisherID;
	
	@Column(nullable = true, unique = false, length = 200)
	private String publisherName;
	
	@Column(nullable = true, unique = false)
	private String description;
	
	
	public Publisher(String publisherName, String description) {
		this.publisherName = publisherName;
		this.description = description;
	}
}
