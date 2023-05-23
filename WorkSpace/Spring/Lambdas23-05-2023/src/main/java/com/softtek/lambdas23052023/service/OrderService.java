package com.softtek.lambdas23052023.service;

import com.softtek.lambdas23052023.model.Order;
import com.softtek.lambdas23052023.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService{
    @Autowired
    IOrderRepository or;

    @Override
    public List<Order> listAll() {
        return or.findAll();
    }
}
