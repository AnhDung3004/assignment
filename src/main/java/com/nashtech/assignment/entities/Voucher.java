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
public class Voucher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int voucherID;
	
	@Column(nullable = true, unique = false)
	private int voucherValue;
	
	@Column(nullable = true, unique = false)
	private Date createdDate;
	
	@Column(nullable = true, unique = false)
	private Date modifiedDate;
	
	@Column(nullable = true, unique = false)
	private boolean isActive;
	
	
	public Voucher(int voucherValue, Date createdDate, Date modifiedDate, boolean isActive) {
		this.voucherValue = voucherValue;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.isActive = isActive;
	}
}
