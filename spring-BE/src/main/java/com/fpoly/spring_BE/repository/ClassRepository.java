package com.fpoly.spring_BE.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fpoly.spring_BE.model.Class;

@Repository
public interface ClassRepository extends JpaRepository<Class, Integer> {
    // Additional query methods if needed

    @Query("SELECT c FROM Class c WHERE "
            + "(:subjectId = 0 OR c.subject.id = :subjectId) AND "
            + "(:levelId = 0 OR c.level.id = :levelId) AND "
            + "(:locationId = 0 OR c.location.id = :locationId) AND "
            + "(:learningMode = '' OR c.learningMode = :learningMode) AND "
            + "(:status = '' OR c.status = :status)")
    Page<Class> findByFilters(
            Pageable pageable, int subjectId, int levelId,
            int locationId, String learningMode, String status);

}
