package com.nashtech.assignment.repository;

import com.nashtech.assignment.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

//    public Cart FindByAccountID(int accountID);
}