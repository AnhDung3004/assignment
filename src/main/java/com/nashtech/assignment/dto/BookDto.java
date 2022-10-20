package com.nashtech.assignment.dto;

import com.nashtech.assignment.entity.Category;
import com.nashtech.assignment.entity.Publisher;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link com.nashtech.assignment.entity.Book} entity
 */
@Data
public class BookDto implements Serializable {
    private final int bookID;
    private final Category category;
    private final Publisher publisher;
    private final AuthorDto author;
    private final String bookName;
    private final Date publishedDate;
    private final String summary;
    private final String imageUrl;
    private final double price;
    private final int quantity;
}