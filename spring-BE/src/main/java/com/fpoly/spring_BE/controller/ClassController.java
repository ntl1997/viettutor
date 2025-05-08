package com.fpoly.spring_BE.controller;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fpoly.spring_BE.model.Class;
import com.fpoly.spring_BE.service.ClassService;

@RestController
public class ClassController {

    private final ClassService classService;

    public ClassController(ClassService classService) {
        this.classService = classService;
    }

    @GetMapping("/lop-moi")
    public ResponseEntity<Page<Class>> getClassesByFilters(
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "size", defaultValue = "10") int size,
            @RequestParam(value = "subjectId", defaultValue = "0") int subjectId,
            @RequestParam(value = "levelId", defaultValue = "0") int levelId,
            @RequestParam(value = "locationId", defaultValue = "0") int locationId,
            @RequestParam(value = "learningMode", defaultValue = "") String learningMode,
            @RequestParam(value = "status", defaultValue = "open") String status) {
        try {
            Page<Class> items = classService.getClassesByFilters(page, size,
                    subjectId, levelId, locationId, learningMode, status);

            if (items.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            }

            return ResponseEntity.ok(items);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
