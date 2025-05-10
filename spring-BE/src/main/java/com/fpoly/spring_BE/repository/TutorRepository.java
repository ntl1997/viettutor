package com.fpoly.spring_BE.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fpoly.spring_BE.model.Tutor;

@Repository
public interface TutorRepository extends JpaRepository<Tutor, Integer> {
    @Query(value = "SELECT TOP 5 t.Id, u.FullName, AVG(r.Rating) AS AverageRating, COUNT(r.Id) AS NumberOfRatings " +
            "FROM Tutors t JOIN Users u ON t.Id = u.Id JOIN Tutor_Ratings r ON t.Id = r.TutorId " +
            "GROUP BY t.Id, u.FullName ORDER BY AverageRating DESC, NumberOfRatings DESC", nativeQuery = true)
    List<Object[]> findTop5Tutors();

    @Query(value = "SELECT t.Id, u.FullName, u.Email, u.PhoneNumber, t.Gender, t.BirthYear, t.ExperienceYears, "
            + "t.AcademicLevel, t.Address, t.Description, t.IsVerified, u.CreatedAt "
            + "FROM Tutors t JOIN Users u ON t.Id = u.Id WHERE t.Id = :tutorId", nativeQuery = true)
    Object findTutorDetailsById(@Param("tutorId") int tutorId);

}
