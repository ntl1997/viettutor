package com.fpoly.spring_BE.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
    @JsonIgnore
    private List<Transaction> transactions;

    @OneToMany(mappedBy = "tutor", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private Set<TutorClassMatch> tutorClassMatches;

    @OneToMany(mappedBy = "tutor", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private Set<TutorApplication> tutorApplications;

    @OneToMany(mappedBy = "tutor", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private Set<TutorRating> tutorRatings;
}
