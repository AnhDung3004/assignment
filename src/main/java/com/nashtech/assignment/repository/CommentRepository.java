package com.nashtech.assignment.repository;

import com.nashtech.assignment.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

//    public Comment FindByAccountID(int accountID);
//
//    public Comment FindByBookID(int bookID);
}