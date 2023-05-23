package com.softtek.lambdas23052023.controller;

import com.softtek.lambdas23052023.model.Customer;
import com.softtek.lambdas23052023.model.Order;
import com.softtek.lambdas23052023.model.Product;
import com.softtek.lambdas23052023.service.ICustomerService;
import com.softtek.lambdas23052023.service.IOrderService;
import com.softtek.lambdas23052023.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private IProductService ps;
    @Autowired
    private IOrderService os;
    @Autowired
    private ICustomerService cs;

    public List<Product> listAllProducts(){
        return ps.listAll();
    }
    public List<Order> listAllOrders(){
        return os.listAll();
    }
    public List<Customer> listAllCustomers(){return cs.listAll(); }
}
