package com.nashtech.assignment.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.nashtech.assignment.entity.Publisher} entity
 */
@Data
public class PublisherDto implements Serializable {
    private final int publisherID;
    private final String publisherName;
    private final String description;
}