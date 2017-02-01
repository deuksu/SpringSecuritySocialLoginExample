package com.spring.security.social.login.example.database.dao;

import org.springframework.stereotype.Service;

import com.spring.security.social.login.example.database.model.User;

@Service("com.spring.security.social.login.example.database.dao.UserGenericDAO")
public class UserGenericDAO extends AbstractGenericDao<User,String> {

  public UserGenericDAO() {
    super(User.class);
  }
  
}
