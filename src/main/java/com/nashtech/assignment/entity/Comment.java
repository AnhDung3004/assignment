package com.nashtech.assignment.entity;

import java.util.Date;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "Comment")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CommentID")
	private int commentID;

	//	@Column(nullable = false, unique = false)
//	private int accountID;
	@ManyToOne
	@JoinColumn(name = "AccountID")
	private Account account;

	//	@Column(nullable = true, unique = false)
//	private int bookID;
	@ManyToOne
	@JoinColumn(name = "BookID")
	private Book book;

	@Column(name = "Content", nullable = true, unique = false)
	private String content;
	
	@Column(name = "CommentedDate", nullable = true, unique = false)
	private Date commentedDate;
	
	@Column(name = "IsActive", nullable = true, unique = false)
	private boolean isActive;
	

	
//	public Comment (String content, Date commentDate, boolean isActive, int accountID, int bookID) {
//		this.content = content;
//		this.commentDate = commentDate;
//		this.isActive = isActive;
//		this.accountID = accountID;
//		this.bookID = bookID;
//	}
}
