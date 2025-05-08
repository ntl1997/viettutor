package com.fpoly.spring_BE.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fpoly.spring_BE.model.Class;

@Repository
public interface ClassRepository extends JpaRepository<Class, Integer> {
    // Additional query methods if needed

    Page<Class> findByStatus(Pageable pageable, String status);

    Page<Class> findBySubjectAndStatus(Pageable pageable, String status, int subjectId);

    Page<Class> findByLevelAndStatus(Pageable pageable, String status, int levelId);

    Page<Class> findByLocaltionAndStatus(Pageable pageable, String status, int locationId);

    Page<Class> findBylearningModeAndStatus(Pageable pageable, String status, String learningMode);
}
