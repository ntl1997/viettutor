package com.fpoly.spring_BE.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Tutors")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tutor {

    @Id
    @Column(name = "Id")
    private int id;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "BirthYear")
    private Integer birthYear;

    @Column(name = "ExperienceYears")
    private Integer experienceYears;

    @Column(name = "AcademicLevel")
    private String academicLevel;

    @Column(name = "Address")
    private String address;

    @Column(name = "Description")
    private String description;

    @Column(name = "IsVerified", nullable = false)
    private boolean isVerified = false;

    @OneToOne
    @MapsId
    @JoinColumn(name = "Id")
    private User user;

    @OneToMany(mappedBy = "tutor")
    private List<Transaction> transactions;

    @OneToMany(mappedBy = "tutor", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<TutorClassMatch> tutorClassMatches;

    @OneToMany(mappedBy = "tutor", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<TutorApplication> tutorApplications;

    @OneToMany(mappedBy = "tutor", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<TutorRating> tutorRatings;
}
