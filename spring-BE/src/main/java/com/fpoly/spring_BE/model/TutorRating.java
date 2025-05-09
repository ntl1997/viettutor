package com.fpoly.spring_BE.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.Date;

@Entity
@Table(name = "Tutor_Ratings")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TutorRating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "TutorId", nullable = false)
    private Tutor tutor;

    @ManyToOne
    @JoinColumn(name = "RatedBy", nullable = false)
    private User ratedBy;

    @Column(name = "Rating", nullable = false)
    @Min(1)
    @Max(5)
    private int rating;

    @Column(name = "Comment")
    private String comment;

    @Column(name = "CreatedAt", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();
}
