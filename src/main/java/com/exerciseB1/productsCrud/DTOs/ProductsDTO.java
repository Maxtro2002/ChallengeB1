package com.exerciseB1.productsCrud.DTOs;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductsDTO {
    private String name;
    private String category;
    private Integer price;
    private String size;
    private Integer stock;
}
