package com.nashtech.assignment.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.nashtech.assignment.entity.Customer} entity
 */
@Data
public class CustomerDto implements Serializable {
    private final int customerID;
    private final AccountDto account;
    private final String customerName;
    private final String phone;
    private final String address;
}