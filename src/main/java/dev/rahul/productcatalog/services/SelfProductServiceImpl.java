package dev.rahul.productcatalog.services;

import dev.rahul.productcatalog.dtos.GenericProductDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SelfProductServiceImpl")
public class SelfProductServiceImpl implements ProductService{
    @Override
    public List<GenericProductDto> getAllProducts() {
        return null;
    }

    @Override
    public GenericProductDto getProductById(Long id) {
        return null;
    }

    @Override
    public GenericProductDto deleteProductById(Long id) {
       return new GenericProductDto();
    }

    @Override
    public GenericProductDto createProduct(GenericProductDto product) {
        return product;
    }

    @Override
    public GenericProductDto updateProduct(GenericProductDto product) {
        return new GenericProductDto();
    }
}
