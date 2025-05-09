package com.fpoly.spring_BE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fpoly.spring_BE.model.TutorApplication;

@Repository
public interface TutorApplicationRepository extends JpaRepository<TutorApplication, Integer> {
    // Additional query methods if needed
}
