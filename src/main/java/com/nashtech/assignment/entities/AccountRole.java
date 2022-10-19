package com.nashtech.assignment.entities;

import javax.persistence.*;

import lombok.*;

import java.util.List;

@Entity
@Table
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AccountRole {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountRoleID;
	
	@Column(nullable = true, unique = false, length=50)
	private String accountRoleName;

	@OneToMany(mappedBy = "accountRole")
	private List<Account> accounts;
	
	
//	public AccountRole(String accountRoleName) {
//		this.accountRoleName = accountRoleName;
//	}
}
