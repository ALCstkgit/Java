package com.softtek.lambdas23052023.repository;

import com.softtek.lambdas23052023.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<Order, Short> {
}
