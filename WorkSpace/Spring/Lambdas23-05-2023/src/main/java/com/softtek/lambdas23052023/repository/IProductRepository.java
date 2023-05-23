package com.softtek.lambdas23052023.repository;

import com.softtek.lambdas23052023.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Short> {
}
