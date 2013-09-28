package com.tunisiana.tutorials.bo.impl;

import com.tunisiana.tutorials.bo.CustomerBo;
import com.tunisiana.tutorials.dao.CustomerDao;
import com.tunisiana.tutorials.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerBo")
public class CustomerBoImpl implements CustomerBo {

    @Autowired
    CustomerDao customerDao;

    public void addCustomer(Customer customer) {
        customerDao.save(customer);

    }

    public List<Customer> findAllCustomer() {
        return customerDao.getAll();
    }

    public Customer getCustomer(Integer customerId) {
        return customerDao.getById(customerId);
    }

}