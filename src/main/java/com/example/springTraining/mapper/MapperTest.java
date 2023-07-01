package com.example.springTraining.mapper;

import com.example.springTraining.domain.UserDomain;
import com.example.springTraining.model.UserModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperTest {

    UserDomain userModelToUserDomain(UserModel model);

    UserModel userDomainToUserModel(UserDomain domain);

}
