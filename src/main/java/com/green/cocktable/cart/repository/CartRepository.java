package com.green.cocktable.cart.repository;

import com.green.cocktable.cart.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, String> {

    List<Cart> findByTableCodeAndCancelYn(String cartCode, char cancelYn);
}
