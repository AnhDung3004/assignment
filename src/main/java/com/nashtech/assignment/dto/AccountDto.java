package com.nashtech.assignment.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.nashtech.assignment.entity.Account} entity
 */
@Data
@Builder
public class AccountDto implements Serializable {
    private final int accountID;
    private final String username;
    private final String displayName;
    private final String email;
    private final boolean isActive;
}