package com.nashtech.assignment.repository;

import com.nashtech.assignment.entity.RatingValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingValueRepository extends JpaRepository<RatingValue, Integer> {

//    public RatingValue FindByName(String ratingValueName);
}