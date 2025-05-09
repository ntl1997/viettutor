package com.fpoly.spring_BE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fpoly.spring_BE.model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    // Additional query methods if needed
}
