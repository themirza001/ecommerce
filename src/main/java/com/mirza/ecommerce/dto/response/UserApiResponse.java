package com.mirza.ecommerce.dto.response;

import lombok.Data;

@Data
public class UserApiResponse {
    private String status;
    private String message;
    private UserResponseDTO user;
}
