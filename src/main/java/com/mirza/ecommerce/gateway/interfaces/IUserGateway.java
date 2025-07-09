package com.mirza.ecommerce.gateway.interfaces;

import com.mirza.ecommerce.dto.response.AllUsersApiResponse;
import com.mirza.ecommerce.dto.response.UserApiResponse;

public interface IUserGateway {

     UserApiResponse fetchUserById(Long id);

     AllUsersApiResponse fetchAllUsers() ;
}
