package com.nashtech.assignment.entity;

import java.io.Serializable;

public class CartDetailCompositeKey implements Serializable {
    private Cart cart;
    private Book book;
}
