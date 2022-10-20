package com.nashtech.assignment.controller;


import com.nashtech.assignment.dto.AccountDto;
import com.nashtech.assignment.entity.Account;
import com.nashtech.assignment.mapper.AccountMapper;
import com.nashtech.assignment.repository.AccountRepository;
import com.nashtech.assignment.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/accounts")
    public List<AccountDto> getAllAccounts() {
        List<AccountDto> accountDtos = accountService.getAll();
        return accountDtos;
    }


}
