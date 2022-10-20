package com.nashtech.assignment.repository;

import com.nashtech.assignment.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

//    public Author FindByName(String authorName);
}