package com.fpoly.spring_BE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fpoly.spring_BE.model.TutorRating;

@Repository
public interface TutorRatingRepository extends JpaRepository<TutorRating, Integer> {
    // Additional query methods if needed
}
