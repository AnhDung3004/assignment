package com.nashtech.assignment.repository;

import com.nashtech.assignment.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository <Account, Integer> {
    public Account findByUsername(String username);

//
//    public Account findByDisplayName(String displayName);
}
