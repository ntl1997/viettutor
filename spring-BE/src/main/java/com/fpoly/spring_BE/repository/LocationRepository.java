package com.fpoly.spring_BE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fpoly.spring_BE.model.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
    // Additional query methods if needed
}
