package com.example.springTraining.model;

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

    @NotNull(message = "nemitavanad null bashad")
    private String fullName;
    private String username;
    private String password;
    @Min(18)
    private long age;
}
