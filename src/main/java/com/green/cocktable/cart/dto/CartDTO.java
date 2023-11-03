package com.green.cocktable.cart.dto;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class CartDTO {

    private String cartCode;
    private String productCode;
    private String optionCode;
    private String tableCode;
    private Date addDate;
    private int count;
    private char cancelYn;
}
