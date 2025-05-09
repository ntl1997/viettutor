package com.fpoly.spring_BE.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fpoly.spring_BE.model.Level;
import com.fpoly.spring_BE.repository.LevelRepository;

@Service
public class LevelService {

    private final LevelRepository levelRepository;

    public LevelService(LevelRepository levelRepository) {
        this.levelRepository = levelRepository;
    }

    public List<Level> getAlllevels() {
        return levelRepository.findAll();
    }

}
