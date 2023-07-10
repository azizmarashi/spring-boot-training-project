package com.example.springTraining.mapper;

import com.example.springTraining.domain.UserDomain;
import com.example.springTraining.model.UserModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDomain userModelToUserDomain(UserModel model);
    UserModel userDomainToUserModel(UserDomain domain);

    List<UserDomain> userModelsToUserDomainList (List<UserModel> models);
    List<UserModel> userDomainsToUserModelList (List<UserDomain> domains);


}
