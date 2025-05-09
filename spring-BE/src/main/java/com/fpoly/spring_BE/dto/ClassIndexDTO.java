package com.fpoly.spring_BE.dto;

import java.util.List;

import com.fpoly.spring_BE.model.Class;
import com.fpoly.spring_BE.model.Level;
import com.fpoly.spring_BE.model.Location;
import com.fpoly.spring_BE.model.Subject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassIndexDTO {

    private List<Class> classes;
    private List<Subject> subjects;
    private List<Level> levels;
    private List<Location> locations;

}
