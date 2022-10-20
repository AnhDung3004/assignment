package com.nashtech.assignment.repository;

import com.nashtech.assignment.entity.Account;
import com.nashtech.assignment.entity.RatingDetail;
import com.nashtech.assignment.entity.RatingDetailCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingDetailRepository extends JpaRepository<RatingDetail, RatingDetailCompositeKey> {

}