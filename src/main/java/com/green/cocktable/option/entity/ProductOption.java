package com.green.cocktable.option.entity;

import com.green.cocktable.cart.entity.Cart;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TBL_COCK_PRODUCT_OPTION")
@DynamicInsert
public class ProductOption {

    @Id
    @Column(name = "OPTION_CODE")
    private String optionCode;

    @Column(name = "PRODUCT_CODE")
    private String productCode;

    @Column(name = "OPTION_NAME")
    private String optionName;

    @Column(name = "OPTION_VALUE")
    private String optionValue;

    @Column(name = "OPTION_PRICE")
    private int optionPrice;

    @Override
    public String toString() {
        return "ProductOption{" +
                "optionCode='" + optionCode + '\'' +
                ", productCode='" + productCode + '\'' +
                ", optionName='" + optionName + '\'' +
                ", optionValue='" + optionValue + '\'' +
                ", optionPrice=" + optionPrice +
                '}';
    }
}
