package com.spring.security.social.login.example.database.dao;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

public abstract class AbstractGenericDao<T extends Serializable, K extends Serializable> {
  
  @Autowired
  private HibernateTemplate hibernateTemplate;
  
  private final Class<T> clazz;

  public AbstractGenericDao(Class<T> clazz) {
    this.clazz = clazz;
  }

  public T load(K id) {
    return hibernateTemplate.load(clazz, id);
  }

  public T get(K id) {
    return hibernateTemplate.get(clazz, id);
  }

}
