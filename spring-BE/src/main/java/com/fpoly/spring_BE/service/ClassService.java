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

    public Page<Class> getClassesByStatus(int page, int size) {
        Sort sort = Sort.by("createdAt").descending();
        Pageable pageable = PageRequest.of(page, size, sort);
        return classRepository.findByStatus(pageable, "open");
    }

    public Page<Class> getClassesBySubjectAndStatus(int page, int size, int subjectId) {
        Sort sort = Sort.by("createdAt").descending();
        Pageable pageable = PageRequest.of(page, size, sort);
        return classRepository.findBySubjectAndStatus(pageable, "open", subjectId);
    }

    public Page<Class> getClassesByLevelAndStatus(int page, int size, int levelId) {
        Sort sort = Sort.by("createdAt").descending();
        Pageable pageable = PageRequest.of(page, size, sort);
        return classRepository.findByLevelAndStatus(pageable, "open", levelId);
    }

    public Page<Class> getClassesByLocationAndStatus(int page, int size, int locationId) {
        Sort sort = Sort.by("createdAt").descending();
        Pageable pageable = PageRequest.of(page, size, sort);
        return classRepository.findByLocationAndStatus(pageable, "open", locationId);
    }

    public Page<Class> getClassesByLearningModeAndStatus(int page, int size, String learningMode) {
        Sort sort = Sort.by("createdAt").descending();
        Pageable pageable = PageRequest.of(page, size, sort);
        return classRepository.findBylearningModeAndStatus(pageable, "open", learningMode);
    }

    public Class saveClass(Class aClass) {
        return classRepository.save(aClass);
    }

    public void deleteClass(int id) {
        classRepository.deleteById(id);
    }

}
