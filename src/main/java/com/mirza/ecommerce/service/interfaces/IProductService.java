package com.mirza.ecommerce.service.interfaces;

import com.mirza.ecommerce.dto.ApiResponse;
import com.mirza.ecommerce.dto.response.AllProductsApiResponse;
import com.mirza.ecommerce.dto.response.ProductApiResponse;
import com.mirza.ecommerce.dto.response.ProductResponseDTO;

import java.util.List;

public interface IProductService {
     ApiResponse<ProductResponseDTO> getProductById(Long id) ;
     ApiResponse<List<ProductResponseDTO>> getAllProducts() ;
}
