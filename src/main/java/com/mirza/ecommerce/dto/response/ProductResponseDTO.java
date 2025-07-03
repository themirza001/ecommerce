package com.mirza.ecommerce.dto.response;

import lombok.Data;

@Data
public class ProductResponseDTO {
    private Long id;
    private String title;
    private String image;
    private Double price;
    private String description;
    private String brand;
    private String model;
    private String color;
    private String category;
    private Boolean onSale;
    private Integer discount;
}
