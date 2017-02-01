package com.spring.security.social.login.example.database.dao;

import org.springframework.stereotype.Repository;

import com.spring.security.social.login.example.database.model.Role;

@Repository("com.spring.security.social.login.example.database.dao.RoleGenericDAO")
public class RoleGenericDAO extends AbstractGenericDao<Role,Integer> {

  public RoleGenericDAO() {
    super(Role.class);
  }

  
}
