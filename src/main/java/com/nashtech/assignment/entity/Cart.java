package com.nashtech.assignment.entity;

import javax.persistence.*;

import lombok.*;

import java.util.List;

@Entity
@Table(name = "Cart")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CartID")
	private int cartID;
	
//	@Column(nullable = false, unique = false)
//	private int accountID;
	@ManyToOne
	@JoinColumn(name = "AccountID")
	private Account account;

	@OneToMany(mappedBy = "cart")
	private List<CartDetail> cartDetails;
	
//	public Cart(int accountID) {
//		this.accountID = accountID;
//	}
}
