package com.nashtech.assignment.mapper;

import com.nashtech.assignment.dto.AccountDto;
import com.nashtech.assignment.entity.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountMapper {

    public AccountDto convertEntityToDto(Account account) {

        return AccountDto.builder().email(account.getEmail())
                .accountID(account.getAccountID())
                .username(account.getUsername())
                .displayName(account.getDisplayName())
                .email(account.getEmail())
                .isActive(account.isActive())
                .build();
    }

    public List<AccountDto> convertListEntityToListDto(List<Account> accounts) {

        List<AccountDto> accountDtos = new ArrayList<>();

        if(accounts == null) {
            return accountDtos;
        }
        for(Account account : accounts) {
            AccountMapper accountMapper = new AccountMapper();
            AccountDto accountDto = accountMapper.convertEntityToDto(account);
            accountDtos.add(accountDto);
        }
        return accountDtos;
    }




}
