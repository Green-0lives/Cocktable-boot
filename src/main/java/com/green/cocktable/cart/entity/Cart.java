package com.green.cocktable.cart.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TBL_COCK_CART")
@DynamicInsert
public class Cart {

    @Id
    @Column(name = "CART_CODE")
    private String cartCode;

    @Column(name = "PRODUCT_CODE")
    private String productCode;

    @Column(name = "OPTION_CODE")
    private String optionCode;

    @Column(name = "TABLE_CODE")
    private String tableCode;

    @Column(name = "ADD_DATE")
    private Date addDate;

    @Column(name = "PRODUCT_COUNT")
    private int count;

    @Column(name = "CANCELL_YN")
    private char cancelYn;

    @Override
    public String toString() {
        return "Cart{" +
                "cartCode='" + cartCode + '\'' +
                ", productCode='" + productCode + '\'' +
                ", optionCode='" + optionCode + '\'' +
                ", tableCode='" + tableCode + '\'' +
                ", addDate=" + addDate +
                ", count=" + count +
                ", cancelYn=" + cancelYn +
                '}';
    }
}
