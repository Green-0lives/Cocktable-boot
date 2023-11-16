package com.green.cocktable.product.repository;

import com.green.cocktable.product.entity.ProductPrice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductPriceRepository extends JpaRepository<ProductPrice, String> {

    List<ProductPrice> findByProductCodeAndSalesYn(String productCode, char salesYn);
}
