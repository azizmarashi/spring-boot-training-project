package com.example.springTraining.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class UserDomain implements Serializable {

    @Serial
    private static final long serialVersionUID = 2002549472325402634L;

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