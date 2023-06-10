package com.exerciseB1.productsCrud.entities;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(value = "products")
public class Products {
    @Id
    private String id;
    private String name;
    private String category;
    private Integer price;
    private String size;
    private Integer stock;
}
