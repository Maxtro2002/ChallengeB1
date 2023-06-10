package com.exerciseB1.productsCrud.repository;

import com.exerciseB1.productsCrud.entities.Products;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductsRepository extends ReactiveCrudRepository<Products, String> {
}
