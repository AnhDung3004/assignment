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
public class RatingValue {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ratingValueID;
	
	@Column(nullable = false, unique = false)
	private int ratingValue;
	
	@Column(nullable = true, unique = false, length=50)
	private String ratingValueName;
	
	
	public RatingValue(int ratingValue, String ratingValueName) {
		this.ratingValue = ratingValue;
		this.ratingValueName = ratingValueName;
	}
}
