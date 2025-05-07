package com.fpoly.spring_BE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fpoly.spring_BE.model.Tutor;

@Repository
public interface TutorRepository extends JpaRepository<Tutor, Integer> {
    // Additional query methods if needed
}
