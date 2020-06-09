package com.oauth.securityoauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oauth.securityoauth.model.User;



@Repository
public interface UserRepository extends JpaRepository < User, Long > {
    User findByEmail(String email);
}