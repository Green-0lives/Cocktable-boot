package com.green.cocktable.product.repository;

import com.green.cocktable.product.entity.ProductOption;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductOptionRepository extends JpaRepository<ProductOption, String> {

    List<ProductOption> findByOptionCode(String optionCode);
}
