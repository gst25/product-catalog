package dev.rahul.productcatalog.services;

import dev.rahul.productcatalog.dtos.GenericProductDto;

import java.util.List;

public interface ProductService {
    List<GenericProductDto> getAllProducts();
    GenericProductDto getProductById(Long id);
    GenericProductDto deleteProductById(Long id);
    GenericProductDto createProduct(GenericProductDto product);
    GenericProductDto updateProduct(GenericProductDto product);
}
