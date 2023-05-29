package com.softtek.lambdas23052023.controller;

import com.softtek.lambdas23052023.dto.ProductDto;
import com.softtek.lambdas23052023.model.Customer;
import com.softtek.lambdas23052023.model.Order;
import com.softtek.lambdas23052023.model.Product;
import com.softtek.lambdas23052023.service.ICustomerService;
import com.softtek.lambdas23052023.service.IOrderService;
import com.softtek.lambdas23052023.service.IProductService;
import com.softtek.lambdas23052023.utils.MapperConfig;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private IProductService ps;
    @Autowired
    private IOrderService os;
    @Autowired
    private ICustomerService cs;
    @Autowired
    private ModelMapper modelMapper;

    public List<Product> listAllProducts(){
        return ps.listAll();
    }
    public List<Order> listAllOrders(){
        return os.listAll();
    }
    public List<Customer> listAllCustomers(){return cs.listAll(); }

    //Con DTOs

    public List<ProductDto> listProductsDto(){
        List<ProductDto> productDtos= ps.listAll()
                .stream()
                .map(p -> modelMapper.map(p,ProductDto.class))
                .toList();
        return productDtos;
    }
}
