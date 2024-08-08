package com.example.crudi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "crud_student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String firtsName;
    private String lastName;
    @Column(name = "email_address", unique = true, nullable = false)
    private String email;

}
