package com.example.springTraining.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class UserDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @Column (name = "full_name")
    private String fullName;

    @Column (name = "username")
    private String username;

    @Column (name = "password")
    private String password;

    @Column (name = "age")
    private long age;

}