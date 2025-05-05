package com.fpoly.spring_BE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fpoly.spring_BE.model.Class;

@Repository
public interface ClassRepository extends JpaRepository<Class, Integer> {
    // Additional query methods if needed
}
