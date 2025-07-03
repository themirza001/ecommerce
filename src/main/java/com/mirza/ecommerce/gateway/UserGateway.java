package com.mirza.ecommerce.gateway;

import com.mirza.ecommerce.dto.response.AllProductsApiResponse;
import com.mirza.ecommerce.dto.response.AllUsersApiResponse;
import com.mirza.ecommerce.dto.response.UserApiResponse;
import com.mirza.ecommerce.dto.response.UserResponseDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class UserGateway {

    private final RestTemplate restTemplate;
    private final String userApi;

    public UserGateway(RestTemplate restTemplate,
                          @Value("${fakestore.api.users}") String productApi) {
        this.restTemplate = restTemplate;
        this.userApi = productApi;
    }


    public UserApiResponse fetchUserById(Long id) {
        return restTemplate.getForObject(userApi + "/" + id, UserApiResponse.class);
    }

    public AllUsersApiResponse fetchAllUsers() {

        return restTemplate.getForObject(userApi, AllUsersApiResponse.class);
    }
}
