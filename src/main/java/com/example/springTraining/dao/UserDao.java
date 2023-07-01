package com.example.springTraining.dao;

import com.example.springTraining.domain.UserDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<UserDomain,Long> {

}
