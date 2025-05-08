package com.fpoly.spring_BE.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.fpoly.spring_BE.model.Class;
import com.fpoly.spring_BE.repository.ClassRepository;

@Service
public class ClassService {

    private final ClassRepository classRepository;

    public ClassService(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

    public Optional<Class> getClassById(int id) {
        return classRepository.findById(id);
    }

    public Page<Class> getAllClasses(int page, int size) {
        Sort sort = Sort.by("createdAt").descending();
        Pageable pageable = PageRequest.of(page, size, sort);
        return classRepository.findAll(pageable);
    }

    public Page<Class> getClassesByFilters(int page, int size, int subjectId,
            int levelId, int locationId, String learningMode, String status) {
        Sort sort = Sort.by("createdAt").descending();
        Pageable pageable = PageRequest.of(page, size, sort);
        return classRepository.findByFilters(pageable, subjectId, levelId, locationId, learningMode, status);
    }

    public Class saveClass(Class aClass) {
        return classRepository.save(aClass);
    }

    public void deleteClass(int id) {
        classRepository.deleteById(id);
    }

}
