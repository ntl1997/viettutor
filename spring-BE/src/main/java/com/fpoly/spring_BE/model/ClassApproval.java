package com.fpoly.spring_BE.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Class_Approvals")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassApproval {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "ClassId", nullable = false)
    private Class aClass;

    @ManyToOne
    @JoinColumn(name = "AdminId", nullable = false)
    private User admin;

    @Column(name = "ApprovedAt", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date approvedAt = new Date();

    @Column(name = "Note")
    private String note;
}
