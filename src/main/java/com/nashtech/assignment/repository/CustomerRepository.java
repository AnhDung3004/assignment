package com.nashtech.assignment.repository;

import com.nashtech.assignment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

//    public Customer FindByCustomerName(String customerName);

//    public Customer FindByAccountID(int accountID);

//    public Customer FindByPhone(String phone);
}