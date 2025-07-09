package com.mirza.ecommerce.service;


import com.mirza.ecommerce.dto.ApiResponse;
import com.mirza.ecommerce.dto.response.AllProductsApiResponse;
import com.mirza.ecommerce.dto.response.ProductApiResponse;
import com.mirza.ecommerce.dto.response.ProductResponseDTO;
import com.mirza.ecommerce.gateway.ProductGateway;
import com.mirza.ecommerce.gateway.interfaces.IProductGateway;
import com.mirza.ecommerce.service.interfaces.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService  implements IProductService {
    private final IProductGateway gateway;

    public ProductService(ProductGateway gateway) {
        this.gateway = gateway;
    }

    public ApiResponse<ProductResponseDTO> getProductById(Long id) {
        ProductApiResponse response = gateway.fetchProductById(id);
        return new ApiResponse<>(
                response.getStatus(),
                response.getMessage(),
                response.getProduct()
        );
    }

    public ApiResponse<List<ProductResponseDTO>> getAllProducts() {
        AllProductsApiResponse response = gateway.fetchAllProducts();
        return new ApiResponse<>(
                response.getStatus(),
                response.getMessage(),
                response.getProducts()
        );
    }
}