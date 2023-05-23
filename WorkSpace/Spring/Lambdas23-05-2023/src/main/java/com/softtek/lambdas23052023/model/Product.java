package com.softtek.lambdas23052023.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private short productId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "supplier_id")
    private short supplierId;
    @Column(name = "category_id")
    private short categoryId;
    @Column(name = "quantity_per_unit")
    private String quantityPerUnit;
    @Column(name = "unit_price")
    private double unitPrice;
    @Column(name = "units_in_stock")
    private short unitsInStock;
    @Column(name = "units_on_order")
    private short unitsOnOrder;
    @Column(name = "reorder_level")
    private short reorderLevel;
    private int discontinued;
}
