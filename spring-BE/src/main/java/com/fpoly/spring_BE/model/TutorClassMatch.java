package com.fpoly.spring_BE.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.Date;

@Entity
@Table(name = "Tutor_Class_Matches")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TutorClassMatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "ClassId", nullable = false)
    private Class aClass;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "TutorId", nullable = false)
    private Tutor tutor;

    @Column(name = "AssignedAt", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date assignedAt = new Date();

    @Column(name = "Note")
    private String note;
}
