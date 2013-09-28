package com.tunisiana.tutorials.bo;

import com.tunisiana.tutorials.model.Customer;

import java.util.List;

public interface CustomerBo {

    void addCustomer(Customer customer);

    List<Customer> findAllCustomer();

    Customer getCustomer(Integer customerId);

}