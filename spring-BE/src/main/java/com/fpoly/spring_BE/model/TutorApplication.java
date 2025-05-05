package com.fpoly.spring_BE.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.Date;

@Entity
@Table(name = "Tutor_Applications")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TutorApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "TutorId", nullable = false)
    private Tutor tutor;

    @Column(name = "CVUrl")
    private String cvUrl;

    @Column(name = "Status", nullable = false)
    private String status = "pending";

    @Column(name = "SubmittedAt", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date submittedAt = new Date();
}
