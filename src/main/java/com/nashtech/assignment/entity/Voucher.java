package com.nashtech.assignment.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "Voucher")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Voucher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VoucherID")
	private int voucherID;
	
	@Column(name = "VoucherValue", nullable = true, unique = false)
	private int voucherValue;
	
	@Column(name = "CreatedDate", nullable = true, unique = false)
	private Date createdDate;
	
	@Column(name = "MOdifiedDate", nullable = true, unique = false)
	private Date modifiedDate;
	
	@Column(name = "IsActive", nullable = true, unique = false)
	private boolean isActive;

	@OneToMany(mappedBy = "voucher")
	private List<OrderBook> orderBooks;
	
//	public Voucher(int voucherValue, Date createdDate, Date modifiedDate, boolean isActive) {
//		this.voucherValue = voucherValue;
//		this.createdDate = createdDate;
//		this.modifiedDate = modifiedDate;
//		this.isActive = isActive;
//	}
}
