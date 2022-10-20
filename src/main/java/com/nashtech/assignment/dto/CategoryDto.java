package com.nashtech.assignment.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.nashtech.assignment.entity.Category} entity
 */
@Data
public class CategoryDto implements Serializable {
    private final int categoryID;
    private final String categoryName;
    private final String description;
}