package com.nashtech.assignment.repository;

import com.nashtech.assignment.entity.OrderBook;
import com.nashtech.assignment.entity.OrderBookDetail;
import com.nashtech.assignment.entity.OrderDetailCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderBookDetailRepository extends JpaRepository<OrderBookDetail, OrderDetailCompositeKey> {
}