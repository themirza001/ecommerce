package com.mirza.ecommerce.controller;

import com.mirza.ecommerce.dto.ApiResponse;
import com.mirza.ecommerce.dto.response.UserApiResponse;
import com.mirza.ecommerce.dto.response.UserResponseDTO;
import com.mirza.ecommerce.service.UserService;
import com.mirza.ecommerce.service.interfaces.IUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final IUserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<UserResponseDTO>> getUser(@PathVariable Long id) {
        return ResponseEntity.ok(service.getUserById(id));
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<UserResponseDTO>>> getAllUsers() {
        return ResponseEntity.ok(service.getAllUsers());
    }
}
