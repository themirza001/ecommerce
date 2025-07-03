package com.mirza.ecommerce.service;

import com.mirza.ecommerce.dto.ApiResponse;
import com.mirza.ecommerce.dto.response.*;
import com.mirza.ecommerce.gateway.UserGateway;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserGateway gateway;

    public UserService(UserGateway gateway) {
        this.gateway = gateway;
    }

    public ApiResponse<UserResponseDTO> getUserById(Long id) {
        UserApiResponse response = gateway.fetchUserById(id);
        return new ApiResponse<>(
                response.getStatus(),
                response.getMessage(),
                response.getUser()
        );
    }

    public ApiResponse<List<UserResponseDTO>> getAllUsers() {

        AllUsersApiResponse response = gateway.fetchAllUsers();
        return new ApiResponse<>(
                response.getStatus(),
                response.getMessage(),
                response.getUsers()
        );
    }
}