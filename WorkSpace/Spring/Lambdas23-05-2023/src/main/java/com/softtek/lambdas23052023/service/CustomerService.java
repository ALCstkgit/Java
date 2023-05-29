package com.softtek.lambdas23052023.service;

import com.softtek.lambdas23052023.model.Customer;
import com.softtek.lambdas23052023.repository.CrudImpl;
import com.softtek.lambdas23052023.repository.ICustomerRepository;
import com.softtek.lambdas23052023.repository.IGenericRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends CrudImpl<Customer, String> implements ICustomerService{
    @Autowired
    private ICustomerRepository cr;

    @Override
    protected IGenericRepo<Customer, String> getRepo() {
        return cr;
    }
}
