package com.fpoly.spring_BE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fpoly.spring_BE.model.TutorClassMatch;

@Repository
public interface TutorClassMatchRepository extends JpaRepository<TutorClassMatch, Integer> {
    // Additional query methods if needed
}
