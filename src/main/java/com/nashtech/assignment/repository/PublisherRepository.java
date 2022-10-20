package com.nashtech.assignment.repository;

import com.nashtech.assignment.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Integer> {

//    public Publisher FindByName(String publisherName);
}