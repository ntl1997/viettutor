package com.fpoly.spring_BE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fpoly.spring_BE.model.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Integer> {
    // Additional query methods if needed
}
