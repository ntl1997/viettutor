package com.fpoly.spring_BE.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fpoly.spring_BE.model.Class;
import com.fpoly.spring_BE.service.ClassService;
import com.fpoly.spring_BE.service.LevelService;
import com.fpoly.spring_BE.service.LocationService;
import com.fpoly.spring_BE.service.SubjectService;

@RestController
public class ClassController {

    private final ClassService classService;
    private final SubjectService subjectService;
    private final LevelService levelService;
    private final LocationService locationService;

    public ClassController(
            ClassService classService,
            SubjectService subjectService,
            LevelService levelService,
            LocationService locationService) {
        this.classService = classService;
        this.subjectService = subjectService;
        this.levelService = levelService;
        this.locationService = locationService;
    }

    // đổ dữ liệu lên trang
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
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(items, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/filter-options")
    public ResponseEntity<Map<String, Object>> getFilterOptions() {
        Map<String, Object> response = new HashMap<>();
        response.put("subjects", subjectService.getAllSubjects());
        response.put("levels", levelService.getAllLevels());
        response.put("locations", locationService.getAllLocations());
        return ResponseEntity.ok(response);
    }

    // Gia sư nhận lớp
    @PutMapping("/lop-moi/{id}")
    public ResponseEntity<Class> assignClass(@PathVariable("id") int id) {
        Optional<Class> existingItemOptional = classService.getClassById(id);
        if (existingItemOptional.isPresent()) {
            Class existingItem = existingItemOptional.get();
            existingItem.setStatus("Assigned");
            return new ResponseEntity<>(classService.saveClass(existingItem), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
