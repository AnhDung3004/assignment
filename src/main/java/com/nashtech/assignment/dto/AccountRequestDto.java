package com.nashtech.assignment.dto;

import com.nashtech.assignment.entity.Account;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.nashtech.assignment.entity.Account} entity
 */
@Data
public class AccountRequestDto {
    private int accountID;
    private String username;
    private String displayName;
    private String email;
    private boolean isActive;

    public Account changeToAccount(){
        Account newAccount = new Account();

        newAccount.setAccountID(accountID);



        return newAccount;
    }
}