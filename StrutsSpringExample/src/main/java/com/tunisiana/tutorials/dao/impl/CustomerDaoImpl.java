package com.tunisiana.tutorials.dao.impl;

import com.tunisiana.tutorials.dao.CustomerDao;
import com.tunisiana.tutorials.model.Customer;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("customerDao")
public class CustomerDaoImpl extends GenericDaoImpl<Customer, Integer> implements CustomerDao {

    @Autowired
    public CustomerDaoImpl(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
        this.setSessionFactory(sessionFactory);
    }

}