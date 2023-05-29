package com.softtek.lambdas23052023.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDto {
    private short supplierId;
    private short categoryId;
    private double unitPrice;
    private short unitsInStock;
    private int discontinued;
}
