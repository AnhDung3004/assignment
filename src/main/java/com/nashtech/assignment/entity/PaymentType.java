package com.nashtech.assignment.entity;

import javax.persistence.*;

import lombok.*;

import java.util.List;

@Entity
@Table(name = "PaymentType")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PaymentType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PaymentTypeID")
	private int paymentTypeID;
	
	@Column(name = "PaymentTypeName", nullable = true, unique = false, length=50)
	private String paymentTypeName;

	@OneToMany (mappedBy = "paymentType")
	private List<OrderBook> orderBooks;
	
//	public PaymentType(String paymentTypeName) {
//		this.paymentTypeName = paymentTypeName;
//	}
}
