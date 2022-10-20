package com.nashtech.assignment.repository;

import com.nashtech.assignment.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

//    public Category FindByName(String categoryName);
}