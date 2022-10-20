package com.nashtech.assignment.dto;

import com.nashtech.assignment.entity.CartDetail;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * A DTO for the {@link com.nashtech.assignment.entity.Cart} entity
 */
@Data
public class CartDto implements Serializable {
    private final int cartID;
    private final AccountDto account;
    private final List<CartDetail> cartDetails;
}