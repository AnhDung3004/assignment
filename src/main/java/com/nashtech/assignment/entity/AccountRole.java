package com.nashtech.assignment.entity;

import javax.persistence.*;

import lombok.*;

import java.util.List;

@Entity
@Table(name = "AccountRole")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AccountRole {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AccountRoleID")
	private int accountRoleID;
	
	@Column(name = "AccountRoleName", nullable = true, unique = false, length=50)
	private String accountRoleName;

	@OneToMany(mappedBy = "accountRole")
	private List<Account> accounts;
	
	
//	public AccountRole(String accountRoleName) {
//		this.accountRoleName = accountRoleName;
//	}
}
