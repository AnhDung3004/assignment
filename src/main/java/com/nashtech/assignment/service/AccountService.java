package com.nashtech.assignment.service;

import com.nashtech.assignment.dto.AccountDto;
import com.nashtech.assignment.entity.Account;
import com.nashtech.assignment.mapper.AccountMapper;
import com.nashtech.assignment.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository repository;


    public AccountDto getById(int id) {
        AccountDto accountDto = null;
        Optional<Account> accountOptional =  repository.findById(id);
        if (accountOptional.isEmpty()) {
//            return Exception

        }
        else {
            //        Convert from entity to DT
            AccountMapper accountMapper = new AccountMapper();
            accountDto = accountMapper.convertEntityToDto(accountOptional.get());
        }
//        Return DTO
        return accountDto;
    }

    public List<AccountDto> getAll() {
        List<AccountDto> accountDtos = new ArrayList<>();
        List<Account> accounts =new ArrayList<>();
        accounts =  repository.findAll();
        if (accounts.isEmpty()) {
//            return Exception

        }
        else {
            //        Convert from entity to DT
            AccountMapper accountMapper = new AccountMapper();
            accountDtos = accountMapper.convertListEntityToListDto(accounts);
        }
//        Return DTO
        return accountDtos;
    }
}
