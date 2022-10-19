package com.nashtech.assignment.entities;

import javax.persistence.*;

import lombok.*;

@Entity
@Table
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountID;

	@ManyToOne
	@JoinColumn(name = "AccountRoleID")
	private AccountRole accountRole;
	
	@Column(nullable = false, unique = true, length=100)
	private String username;
	
	@Column(nullable = false, unique = false, length=100)
	private String password;
	
	@Column(nullable = true, unique = false, length=100)
	private String displayName;
	
	@Column(nullable = false, unique = true, length=100)
	private String email;
	
	@Column(nullable = true, unique = false)
	private boolean isActive;
	
	
//	public Account(int accountRoleID, String username, String password, String displayName, String email, boolean isActive) {
//		this.accountRole.setAccountRoleID() = accountRoleID;
//		this.username = username;
//		this.password = password;
//		this.displayName = displayName;
//		this.email = email;
//		this.isActive = isActive;
//	}
}
