package com.nashtech.assignment.entities;

import java.util.Date;

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
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int commentID;
	
	@Column(nullable = true, unique = false)
	private String content;
	
	@Column(nullable = true, unique = false)
	private Date commentDate;
	
	@Column(nullable = true, unique = false)
	private boolean isActive;
	
	@Column(nullable = false, unique = false)
	private int accountID;
	
	@Column(nullable = true, unique = false)
	private int bookID;
	
	
	public Comment (String content, Date commentDate, boolean isActive, int accountID, int bookID) {
		this.content = content;
		this.commentDate = commentDate;
		this.isActive = isActive;
		this.accountID = accountID;
		this.bookID = bookID;
	}
}
