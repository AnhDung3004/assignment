package com.nashtech.assignment.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.nashtech.assignment.entity.Author} entity
 */
@Data
public class AuthorDto implements Serializable {
    private final int authorID;
    private final String authorName;
    private final String description;
}