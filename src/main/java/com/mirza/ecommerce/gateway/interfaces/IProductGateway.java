package com.mirza.ecommerce.gateway.interfaces;

import com.mirza.ecommerce.dto.response.AllProductsApiResponse;
import com.mirza.ecommerce.dto.response.ProductApiResponse;

public interface IProductGateway {
     ProductApiResponse fetchProductById(Long id) ;
     AllProductsApiResponse fetchAllProducts();
}

