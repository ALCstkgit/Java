package com.softtek.lambdas23052023.service;

import com.softtek.lambdas23052023.model.Customer;
import com.softtek.lambdas23052023.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    private ICustomerRepository cr;

    @Override
    public List<Customer> listAll() {
        return cr.findAll();
    }
}
