package com.green.cocktable.cart.entity;

import com.green.cocktable.product.entity.ProductOption;
import com.green.cocktable.product.entity.ProductPrice;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
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

    @Column(name = "ITEM_CODE")
    private int itemCode;

    @Column(name = "ADD_DATE")
    private Date addDate;

    @Column(name = "PRODUCT_COUNT")
    private int count;

    @Column(name = "CANCEL_YN")
    private char cancelYn;

    @OneToMany
    @JoinColumn(name = "PRODUCT_CODE")
    private List<ProductPrice> products;

    @OneToMany
    @JoinColumn(name = "PRODUCT_CODE")
    private List<ProductOption> options;

}
