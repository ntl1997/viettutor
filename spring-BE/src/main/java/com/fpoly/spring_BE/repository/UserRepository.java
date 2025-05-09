package com.fpoly.spring_BE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fpoly.spring_BE.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // Additional query methods if needed
}
