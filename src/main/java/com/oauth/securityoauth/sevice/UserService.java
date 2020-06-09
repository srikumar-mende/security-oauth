package com.oauth.securityoauth.sevice;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.oauth.securityoauth.model.User;
import com.oauth.securityoauth.model.UserRegistrationDto;


public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
