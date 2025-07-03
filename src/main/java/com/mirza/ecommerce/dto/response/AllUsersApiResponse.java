package com.mirza.ecommerce.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class AllUsersApiResponse {
    private String status;
    private String message;
    private List<UserResponseDTO> users;
}
