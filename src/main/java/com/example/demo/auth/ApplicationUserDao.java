package com.example.demo.auth;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Optional;


public interface ApplicationUserDao {
    Optional<ApplicationUser> selectApplicationUserByUsername(String username);
}
