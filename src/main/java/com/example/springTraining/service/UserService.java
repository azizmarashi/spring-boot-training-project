package com.example.springTraining.service;

import com.example.springTraining.model.UserModel;

public interface UserService {
    UserModel registerNewUser(UserModel userModel);

    UserModel registerNewUserWithMapper(UserModel userModel);
}
