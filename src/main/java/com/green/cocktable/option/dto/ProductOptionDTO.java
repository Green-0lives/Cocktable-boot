package com.green.cocktable.option.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class ProductOptionDTO {

    private String optionCode;
    private String productCode;
    private String optionName;
    private String optionValue;
    private int optionPrice;
}
