package com.mirza.ecommerce.dto.response;
import lombok.Data;
import lombok.Getter;

@Data
public class ProductApiResponse {
    private String status;
    private String message;
    private ProductResponseDTO product;
}
