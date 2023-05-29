package com.softtek.lambdas23052023.service;

import com.softtek.lambdas23052023.model.Order;
import com.softtek.lambdas23052023.repository.CrudImpl;
import com.softtek.lambdas23052023.repository.IGenericRepo;
import com.softtek.lambdas23052023.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends CrudImpl<Order,Short> implements IOrderService{
    @Autowired
    IOrderRepository or;

    @Override
    protected IGenericRepo<Order, Short> getRepo() {
        return or;
    }
}
