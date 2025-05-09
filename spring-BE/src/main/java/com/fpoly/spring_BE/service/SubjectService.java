package com.fpoly.spring_BE.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fpoly.spring_BE.model.Subject;
import com.fpoly.spring_BE.repository.SubjectRepository;

@Service
public class SubjectService {

    private final SubjectRepository subjectRepository;

    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

}
