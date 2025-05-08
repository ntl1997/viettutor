package com.fpoly.spring_BE.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
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
    @NotNull(message = "PostedBy cannot be null")
    private User postedBy;

    @ManyToOne
    @JoinColumn(name = "SubjectId", nullable = false)
    @NotNull(message = "Subject cannot be null")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "LevelId", nullable = false)
    @NotNull(message = "Level cannot be null")
    private Level level;

    @ManyToOne
    @JoinColumn(name = "LocationId")
    @NotNull(message = "Location cannot be null")
    private Location location;

    @ManyToOne
    @JoinColumn(name = "PreferredTutorId")
    @NotNull(message = "PreferredTutor cannot be null")
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
    @Min(value = 1, message = "Number of students must be at least 1")
    @Max(value = 100, message = "Number of students cannot exceed 100")
    private int numberOfStudents = 1;

    @Column(name = "Schedule")
    @NotBlank(message = "Schedule cannot be blank")
    private String schedule;

    @Column(name = "LearningMode")
    @NotBlank(message = "LearningMode cannot be blank")
    private String learningMode;

    @Column(name = "Requirements")
    @Size(max = 500, message = "Requirements cannot exceed 500 characters")
    private String requirements;

    @Column(name = "Status", nullable = false)
    @NotBlank(message = "Status cannot be blank")
    private String status = "pending";

    @Column(name = "CreatedAt", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @PastOrPresent(message = "CreatedAt must be in the past or present")
    private Date createdAt = new Date();
}
