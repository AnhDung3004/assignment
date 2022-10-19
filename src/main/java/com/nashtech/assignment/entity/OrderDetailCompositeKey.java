package com.nashtech.assignment.entity;

import java.io.Serializable;

public class OrderDetailCompositeKey implements Serializable {
    private OrderBook orderBook;
    private Book book;
}
