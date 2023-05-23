package com.softtek.lambdas23052023.service;

import com.softtek.lambdas23052023.model.Product;
import com.softtek.lambdas23052023.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductRepository pr;

    @Override
    public List<Product> listAll() {
        return pr.findAll();
    }
}
