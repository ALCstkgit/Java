package com.softtek.lambdas23052023.repository;

import com.softtek.lambdas23052023.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer,String> {
}
