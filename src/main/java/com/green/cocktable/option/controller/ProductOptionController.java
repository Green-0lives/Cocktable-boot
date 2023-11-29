package com.green.cocktable.option.controller;

import com.green.cocktable.commons.ResponseDTO;
import com.green.cocktable.option.dto.ProductOptionDTO;
import com.green.cocktable.option.service.ProductOptionService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhosml:3000")
@RequestMapping("/api")
public class ProductOptionController {

    private final ProductOptionService productOptionService;

    @Autowired
    public ProductOptionController(ProductOptionService productOptionService) {
        this.productOptionService = productOptionService;
    }

    @Operation(summary = "상품 옵션 리스트 조회 요청", description = "상품 옵션 리스트를 조회하여 가지고 옵니다.", tags = {"Option"})
    @GetMapping("/optionList/{productCode}")
    public ResponseEntity<ResponseDTO> optionListAllPrint(@PathVariable String productCode) {

        List<ProductOptionDTO> optionList = productOptionService.optionList(productCode);

        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "조회성공",(Object) optionList));
    }
}
