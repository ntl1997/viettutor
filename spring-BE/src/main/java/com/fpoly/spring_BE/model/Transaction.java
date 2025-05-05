package com.fpoly.spring_BE.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Transactions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "ClassId", nullable = false)
    private Class aClass;

    @ManyToOne
    @JoinColumn(name = "TutorId", nullable = false)
    private Tutor tutor;

    @Column(name = "Amount", nullable = false)
    private double amount;

    @Column(name = "PaymentDate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date paymentDate = new Date();

    @Column(name = "Status", nullable = false)
    private String status = "pending";

    @Column(name = "Note")
    private String note;
}
