package com.softtek.lambdas23052023.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id")
    private short orderId;
    @Column(name="customer_id")
    private String customerId;
    @Column(name="employee_id")
    private short employeeId;
    @Column(name="order_date")
    private Date orderDate;
    @Column(name="required_date")
    private Date requiredDate;
    @Column(name="shipped_date")
    private Date shippedDate;
    @Column(name="ship_via")
    private short shipVia;
    private double freight;
    @Column(name="ship_name")
    private String shipName;
    @Column(name="ship_address")
    private String shipAddress;
    @Column(name="ship_city")
    private String shipCity;
    @Column(name="ship_region")
    private String shipRegion;
    @Column(name="ship_postal_code")
    private String shipPostalCode;
    @Column(name="ship_country")
    private String shipCountry;
}
