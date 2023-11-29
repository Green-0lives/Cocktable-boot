package com.green.cocktable.cart.dto;

import com.green.cocktable.option.dto.ProductOptionDTO;
import com.green.cocktable.product.dto.ProductPriceDTO;
import lombok.*;

import java.util.Date;
import java.util.List;

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
    private int itemCode;     // 같은 상품인지를 구분하기 위한 번호
    private Date addDate;
    private int count;
    private char cancelYn;
    private List<ProductPriceDTO> products;
    private List<ProductOptionDTO> options;
}
