package com.nashtech.assignment.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.nashtech.assignment.entity.CartDetail} entity
 */
@Data
public class CartDetailDto implements Serializable {
    private final CartDto cart;
    private final BookDto book;
    private final int quantity;
    private final double costPreDiscount;
    private final double costAfterDiscount;
}