package com.green.cocktable.cart.service;

import com.green.cocktable.cart.dto.CartDTO;
import com.green.cocktable.cart.entity.Cart;
import com.green.cocktable.cart.repository.CartRepository;
import com.green.cocktable.option.entity.ProductOption;
import com.green.cocktable.product.entity.ProductPrice;
import com.green.cocktable.option.repossitory.ProductOptionRepository;
import com.green.cocktable.product.repository.ProductPriceRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class CartService {

    private final ModelMapper modelMapper;
    private final CartRepository cartRepository;
    private final ProductPriceRepository productPriceRepository;
    private final ProductOptionRepository productOptionRepository;

    public CartService(ModelMapper modelMapper, CartRepository cartRepository, ProductPriceRepository productPriceRepository, ProductOptionRepository productOptionRepository) {
        this.modelMapper = modelMapper;
        this.cartRepository = cartRepository;
        this.productPriceRepository = productPriceRepository;
        this.productOptionRepository = productOptionRepository;
    }

    /* 장바구니 목록 조회 */
    public List<CartDTO> AllcartList(String tableCode) {

        List<Cart> cartList = cartRepository.findByTableCodeAndCancelYn(tableCode,'N');

        for (Cart cart : cartList) {

            List<ProductPrice> products = productPriceRepository.findByProductCodeAndSalesYn(cart.getProductCode(), 'Y');

            cart.setProducts(products);

            List<ProductOption> options = productOptionRepository.findByOptionCode(cart.getOptionCode());

            cart.setOptions(options);
        }

        return cartList.stream().map(cart -> modelMapper.map(cart, CartDTO.class)).collect(Collectors.toList());
    }

    /* 장바구니 상품 추가 */
    @Transactional
    public Object addCartItem(CartDTO cartDTO) {

        int result = 0;

        try {

            Cart insertCartItem = modelMapper.map(cartDTO, Cart.class);

            cartRepository.save(insertCartItem);

            result = 1;

        } catch (Exception e) {

            throw  new RuntimeException(e);
        }

        return (result > 0) ? "상품 추가 성공" : "상품 추가 실패";
    }

}
