package com.mirza.ecommerce.service.interfaces;

import com.mirza.ecommerce.dto.ApiResponse;
import com.mirza.ecommerce.dto.response.AllUsersApiResponse;
import com.mirza.ecommerce.dto.response.UserApiResponse;
import com.mirza.ecommerce.dto.response.UserResponseDTO;

import java.util.List;

public interface IUserService {
     ApiResponse<UserResponseDTO> getUserById(Long id) ;

     ApiResponse<List<UserResponseDTO>> getAllUsers() ;
}
