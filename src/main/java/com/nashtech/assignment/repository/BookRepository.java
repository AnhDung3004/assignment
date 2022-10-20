package com.nashtech.assignment.repository;

import com.nashtech.assignment.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

//    public Book FindByBookName(String bookName);
}