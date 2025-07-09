package com.mirza.ecommerce.gateway;

import com.mirza.ecommerce.dto.response.AllProductsApiResponse;
import com.mirza.ecommerce.dto.response.ProductApiResponse;
import com.mirza.ecommerce.gateway.interfaces.IProductGateway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProductGateway implements IProductGateway {

    private final RestTemplate restTemplate;
    private final String productApi;

    public ProductGateway(RestTemplate restTemplate,
                          @Value("${fakestore.api.products}") String productApi) {
        this.restTemplate = restTemplate;
        this.productApi = productApi;
    }

    public ProductApiResponse fetchProductById(Long id) {
        return restTemplate.getForObject(productApi + "/" + id, ProductApiResponse.class);
    }

    public AllProductsApiResponse fetchAllProducts() {
        return restTemplate.getForObject(productApi, AllProductsApiResponse.class);
    }
}


