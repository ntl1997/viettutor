package com.fpoly.spring_BE.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
// import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @Column(name = "FullName", nullable = false)
    @NotBlank(message = "Full name is required")
    private String fullName;

    @Column(name = "Email", nullable = false, unique = true)
    @NotBlank(message = "Email is required")
    private String email;

    @Column(name = "PhoneNumber")
    @NotBlank(message = "Phone number is required")
    private String phoneNumber;

    @Column(name = "PasswordHash", nullable = false)
    @NotBlank(message = "Password is required")
    private String passwordHash;

    @Column(name = "Role", nullable = false)
    @NotBlank(message = "Role is required")
    private String role;

    @Column(name = "CreatedAt", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private Tutor tutor;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Notification> notifications = new ArrayList<>();

    @OneToMany(mappedBy = "postedBy", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Class> classes = new ArrayList<>();

    @OneToMany(mappedBy = "ratedBy", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<TutorRating> tutorRatings = new ArrayList<>();

    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<ClassApproval> classApprovals = new ArrayList<>();
}
