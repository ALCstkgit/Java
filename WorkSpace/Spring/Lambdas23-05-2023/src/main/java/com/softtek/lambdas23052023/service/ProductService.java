package com.softtek.lambdas23052023.service;

import com.softtek.lambdas23052023.model.Product;
import com.softtek.lambdas23052023.repository.CrudImpl;
import com.softtek.lambdas23052023.repository.IGenericRepo;
import com.softtek.lambdas23052023.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends CrudImpl<Product,Short> implements IProductService{
    @Autowired
    private IProductRepository pr;

    @Override
    protected IGenericRepo<Product, Short> getRepo() {
        return pr;
    }
}
