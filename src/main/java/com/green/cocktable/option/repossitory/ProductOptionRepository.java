package com.green.cocktable.option.repossitory;

import com.green.cocktable.option.entity.ProductOption;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductOptionRepository extends JpaRepository<ProductOption, String> {

    List<ProductOption> findByOptionCode(String optionCode);

    List<ProductOption> findByProductCode(String productCode);
}
