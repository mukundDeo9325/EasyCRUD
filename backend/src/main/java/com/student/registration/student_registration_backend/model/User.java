package com.student.registration.student_registration_backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "course")
    private String course;

    @Column(name = "student_class")
    private String studentClass;

    @Column(name = "percentage")
    private Double percentage;

    @Column(name = "branch")
    private String branch;

    @Column(name = "mobile_number")
    private String mobileNumber;
}
