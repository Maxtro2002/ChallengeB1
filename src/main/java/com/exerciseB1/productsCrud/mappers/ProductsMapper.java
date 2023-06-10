package com.exerciseB1.productsCrud.mappers;

import com.exerciseB1.productsCrud.DTOs.ProductsDTO;
import com.exerciseB1.productsCrud.entities.Products;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ProductsMapper {
    public Function<ProductsDTO, Products> mapperToProductEntity(){
        return updateEntity -> {
          var product = new Products();
          product.setName(updateEntity.getName());
          product.setCategory(updateEntity.getCategory());
          product.setPrice(updateEntity.getPrice());
          product.setSize(updateEntity.getSize());
          product.setStock(updateEntity.getStock());
          return product;
        };
    }
}
