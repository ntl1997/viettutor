package com.fpoly.spring_BE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fpoly.spring_BE.model.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
    // Additional query methods if needed
}
