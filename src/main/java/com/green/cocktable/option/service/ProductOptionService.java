package com.green.cocktable.option.service;

import com.green.cocktable.option.dto.ProductOptionDTO;
import com.green.cocktable.option.entity.ProductOption;
import com.green.cocktable.option.repossitory.ProductOptionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductOptionService {

    private final ProductOptionRepository productOptionRepository;

    private final ModelMapper modelMapper;

    @Autowired
    public ProductOptionService(ProductOptionRepository productOptionRepository, ModelMapper modelMapper) {
        this.productOptionRepository = productOptionRepository;
        this.modelMapper = modelMapper;
    }

    public List<ProductOptionDTO> optionList(String productCode) {

        List<ProductOption> optionList = productOptionRepository.findByProductCode(productCode);

        return optionList.stream().map(option -> modelMapper.map(option, ProductOptionDTO.class)).collect(Collectors.toList());
    }
}
