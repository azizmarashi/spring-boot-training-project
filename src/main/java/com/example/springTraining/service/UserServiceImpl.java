package com.example.springTraining.service;

import com.example.springTraining.dao.UserDao;
import com.example.springTraining.domain.UserDomain;
import com.example.springTraining.mapper.MapperTest;
import com.example.springTraining.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Autowired
    private MapperTest mapper;

    @Override
    public UserModel registerNewUser(UserModel userModel) {

        UserDomain user = new UserDomain();

        user.setFullName(userModel.getFullName());
        user.setAge(userModel.getAge());
        user.setUsername(userModel.getUsername());
        user.setPassword(userModel.getPassword());

        userDao.save(user);
        return userModel;
    }

    @Override
    public UserModel registerNewUserWithMapper(UserModel userModel) {
        UserDomain user = mapper.userModelToUserDomain(userModel);
        userDao.save(user);
        return userModel;
    }


}
