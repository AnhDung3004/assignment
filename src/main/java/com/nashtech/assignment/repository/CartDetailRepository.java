package com.nashtech.assignment.repository;

import com.nashtech.assignment.entity.Book;
import com.nashtech.assignment.entity.Cart;
import com.nashtech.assignment.entity.CartDetail;
import com.nashtech.assignment.entity.CartDetailCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartDetailRepository extends JpaRepository<CartDetail, CartDetailCompositeKey> {

}