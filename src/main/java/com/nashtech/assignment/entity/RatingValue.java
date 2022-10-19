package com.nashtech.assignment.entity;

import javax.persistence.*;

import lombok.*;

import java.util.List;

@Entity
@Table(name = "RatingValue")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RatingValue {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RatingValueID")
	private int ratingValueID;
	
	@Column(name = "RatingValue", nullable = false, unique = false)
	private int ratingValue;
	
	@Column(name = "RatingValueName", nullable = true, unique = false, length=50)
	private String ratingValueName;


	@OneToMany(mappedBy = "ratingValue")
	private List<RatingDetail> ratingDetails;
	
	
//	public RatingValue(int ratingValue, String ratingValueName) {
//		this.ratingValue = ratingValue;
//		this.ratingValueName = ratingValueName;
//	}
}
