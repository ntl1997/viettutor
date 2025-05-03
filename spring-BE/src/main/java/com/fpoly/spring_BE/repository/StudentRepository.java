package com.fpoly.spring_BE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fpoly.spring_BE.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
