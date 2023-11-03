package com.green.cocktable.cart.service;

import com.green.cocktable.cart.dto.CartDTO;
import com.green.cocktable.cart.entity.Cart;
import com.green.cocktable.cart.repository.CartRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class CartService {

    private final ModelMapper modelMapper;

    private final CartRepository cartRepository;

    @Autowired
    public CartService(ModelMapper modelMapper, CartRepository cartRepository) {
        this.modelMapper = modelMapper;
        this.cartRepository = cartRepository;
    }

    public List<CartDTO> AllcartList(String tableCode) {

        List<Cart> cartList = cartRepository.findByTableCodeAndCancelYn(tableCode,'N');

        return cartList.stream().map(cart -> modelMapper.map(cart, CartDTO.class)).collect(Collectors.toList());
    }
}
