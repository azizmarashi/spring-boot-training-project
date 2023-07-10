package com.example.springTraining.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

    @NotNull(message = "can not be null")
    private String fullName;
    private String username;

    @JsonIgnore
    private String password;
    @Min(18)
    private long age;
}
