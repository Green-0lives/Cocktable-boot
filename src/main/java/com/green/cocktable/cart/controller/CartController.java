package com.green.cocktable.cart.controller;

import com.green.cocktable.cart.dto.CartDTO;
import com.green.cocktable.cart.service.CartService;
import com.green.cocktable.commons.ResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CartController {

    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @Operation(summary = "장바구니 리스트 요청", description = "현재 테이블의 장바구니 리스트를 요청합니다.", tags = {"Cart"})
    @GetMapping("/cartList/{tableCode}")
    public ResponseEntity<ResponseDTO> AllCartListPrint(@PathVariable String tableCode) {

        List<CartDTO> cartList = cartService.AllcartList(tableCode);

        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "조회성공",(Object) cartList));

    }

    @Operation(summary = "장바구니 상품 추가 요청", description = "장바구니에 선택한 상품을 추가합니다.", tags = {"Cart"})
    @PostMapping(value = "/cart/addItem")
    public ResponseEntity<ResponseDTO> addCartItem(@ModelAttribute CartDTO cartDTO) {

        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "신규 장바구니 상품 추가 성공", cartService.addCartItem(cartDTO)));
    }

}
