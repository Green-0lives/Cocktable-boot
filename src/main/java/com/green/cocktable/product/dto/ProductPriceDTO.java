package com.green.cocktable.product.dto;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class ProductPriceDTO {

    private String productCode;
    private int price;
    private String name;
    private char salesYn;
    private char displayYn;
}
