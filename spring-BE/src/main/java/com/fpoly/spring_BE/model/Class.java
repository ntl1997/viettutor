package com.fpoly.spring_BE.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Classes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    // Relationships
    @ManyToOne
    @JoinColumn(name = "PostedBy", nullable = false)
    private User postedBy;

    @ManyToOne
    @JoinColumn(name = "SubjectId", nullable = false)
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "LevelId", nullable = false)
    private Level level;

    @ManyToOne
    @JoinColumn(name = "LocationId")
    private Location location;

    @ManyToOne
    @JoinColumn(name = "PreferredTutorId")
    private Tutor preferredTutor;

    @OneToMany(mappedBy = "aClass", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<ClassApproval> classApprovals;

    @OneToMany(mappedBy = "aClass", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Transaction> transactions;

    @OneToMany(mappedBy = "aClass", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<TutorClassMatch> tutorClassMatches;

    // Attributes
    @Column(name = "NumberOfStudents", nullable = false)
    private int numberOfStudents = 1;

    @Column(name = "Schedule")
    private String schedule;

    @Column(name = "LearningMode")
    private String learningMode;

    @Column(name = "Requirements")
    private String requirements;

    @Column(name = "Status", nullable = false)
    private String status = "pending";

    @Column(name = "CreatedAt", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();
}
