package com.example.springTraining.service;

import com.example.springTraining.dao.UserDao;
import com.example.springTraining.domain.UserDomain;
import com.example.springTraining.mapper.UserMapper;
import com.example.springTraining.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserMapper userMapper;

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
        UserDomain user = userMapper.userModelToUserDomain(userModel);
        userDao.save(user);
        return userModel;
    }

    @Override
    public List<UserModel> findAllUsers() {
        List<UserDomain> allUsers =  userDao.findAll();
        return userMapper.userDomainsToUserModelList(allUsers);
    }


}
