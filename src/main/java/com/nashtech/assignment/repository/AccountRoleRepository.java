package com.nashtech.assignment.repository;

import com.nashtech.assignment.entity.AccountRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRoleRepository extends JpaRepository<AccountRole, Integer> {

//    public AccountRole FindByAccountRoleName(String accountRoleName);
}