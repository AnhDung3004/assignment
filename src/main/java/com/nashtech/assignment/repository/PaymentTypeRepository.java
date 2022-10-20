package com.nashtech.assignment.repository;

import com.nashtech.assignment.entity.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentTypeRepository extends JpaRepository<PaymentType, Integer> {

//    public PaymentType FindByName(String paymentTypeName);
}