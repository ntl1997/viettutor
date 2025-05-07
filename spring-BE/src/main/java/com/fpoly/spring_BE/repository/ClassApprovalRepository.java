package com.fpoly.spring_BE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fpoly.spring_BE.model.ClassApproval;

@Repository
public interface ClassApprovalRepository extends JpaRepository<ClassApproval, Integer> {
    // Additional query methods if needed
}
