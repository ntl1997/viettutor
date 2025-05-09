package com.fpoly.spring_BE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fpoly.spring_BE.model.Level;

@Repository
public interface LevelRepository extends JpaRepository<Level, Integer> {
    // Additional query methods if needed
}
