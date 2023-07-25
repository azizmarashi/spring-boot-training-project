package com.example.springTraining.service;

import com.example.springTraining.model.UserModel;
import java.util.List;

public interface UserService {
    UserModel registerNewUser(UserModel userModel);

    UserModel registerNewUserWithMapper(UserModel userModel);

    List<UserModel> findAllUsers();
}