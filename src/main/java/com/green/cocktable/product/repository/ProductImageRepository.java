package com.green.cocktable.product.repository;

import com.green.cocktable.product.entity.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductImageRepository extends JpaRepository<ProductImage, String> {

    /* 상품리스트 가져오기 (삭제 표시된 상품은 제외) */
    List<ProductImage> findByProductCodeAndImageDeleteYn(String productCode, char imageDeleteYn);
}
