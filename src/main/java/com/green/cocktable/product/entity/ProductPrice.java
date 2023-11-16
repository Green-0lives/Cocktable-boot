package com.green.cocktable.product.entity;

import com.green.cocktable.cart.entity.Cart;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TBL_COCK_PRODUCT")
@DynamicInsert
public class ProductPrice {

    @Id
    @Column(name = "PRODUCT_CODE")
    private String productCode;

    @Column(name = "PRODUCT_NAME")
    private String name;

    @Column(name = "PRODUCT_PRICE")
    private int price;

    @Column(name = "SALES_YN")
    private char salesYn;

    @Column(name = "DISPLAY_YN")
    private char displayYn;

    @Override
    public String toString() {
        return "ProductPrice{" +
                "productCode='" + productCode + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
