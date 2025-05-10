package com.fpoly.spring_BE.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fpoly.spring_BE.model.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
    @Query(value = "SELECT TOP 5 s.Id, s.Name, COUNT(c.Id) AS NumberOfClasses "
            + "FROM Subjects s JOIN Classes c ON s.Id = c.SubjectId "
            + "GROUP BY s.Id, s.Name ORDER BY NumberOfClasses DESC", nativeQuery = true)
    List<Object[]> findTop5SubjectsWithMostClasses();

    @Query(value = "SELECT s.Id, s.Name, COUNT(c.Id) AS TotalClasses "
            + "FROM Subjects s LEFT JOIN Classes c ON s.Id = c.SubjectId "
            + "WHERE s.Id = :subjectId GROUP BY s.Id, s.Name", nativeQuery = true)
    Object findSubjectDetailsById(@Param("subjectId") int subjectId);
}
