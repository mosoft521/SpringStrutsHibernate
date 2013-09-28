package com.tunisiana.tutorials.dao.impl;

import com.tunisiana.tutorials.dao.AuthorityDao;
import com.tunisiana.tutorials.model.Authority;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("authorityDao")
public class AuthorityDaoImpl extends GenericDaoImpl<Authority, Integer> implements AuthorityDao {

    @Autowired
    public AuthorityDaoImpl(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
        this.setSessionFactory(sessionFactory);
    }
}
