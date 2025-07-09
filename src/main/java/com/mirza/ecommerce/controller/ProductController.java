package com.mirza.ecommerce.controller;


import com.mirza.ecommerce.dto.ApiResponse;

import com.mirza.ecommerce.dto.response.ProductResponseDTO;
import com.mirza.ecommerce.service.ProductService;
import com.mirza.ecommerce.service.interfaces.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final IProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<ProductResponseDTO>> getProductById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getProductById(id));
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<ProductResponseDTO>>> getAllProducts() {
        return ResponseEntity.ok(service.getAllProducts());
    }
}
