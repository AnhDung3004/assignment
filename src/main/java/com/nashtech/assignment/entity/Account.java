package com.nashtech.assignment.entity;

import javax.persistence.*;

import lombok.*;

import java.util.List;

@Entity
@Table(name = "Account")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AccountID")
	private int accountID;

//	@Column(nullable = false, unique = false)
//	private int accountRoleID;
	@ManyToOne
	@JoinColumn(name = "AccountRoleID")
	private AccountRole accountRole;
	
	@Column(name = "Username",nullable = false, unique = true, length=100)
	private String username;
	
	@Column(name = "Password", nullable = false, unique = false, length=100)
	private String password;
	
	@Column(name = "DisplayName",nullable = true, unique = false, length=100)
	private String displayName;
	
	@Column(name = "Email", nullable = false, unique = true, length=100)
	private String email;
	
	@Column(name = "IsActive", nullable = true, unique = false)
	private boolean isActive;

	@OneToMany(mappedBy = "account")
	private List<Customer> customers;

	@OneToMany(mappedBy = "account")
	private List<Comment> comments;

	@OneToMany(mappedBy = "account")
	private  List<RatingDetail> ratingDetails;

	@OneToMany(mappedBy = "account")
	private List<Cart> carts;
	
	
//	public Account(int accountRoleID, String username, String password, String displayName, String email, boolean isActive) {
//		this.accountRole.setAccountRoleID() = accountRoleID;
//		this.username = username;
//		this.password = password;
//		this.displayName = displayName;
//		this.email = email;
//		this.isActive = isActive;
//	}
}
