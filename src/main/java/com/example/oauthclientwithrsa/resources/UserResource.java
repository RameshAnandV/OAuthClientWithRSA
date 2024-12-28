package com.example.oauthclientwithrsa.resources;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {
    @GetMapping("/getUser")
    public String getUser(Authentication authentication) {
        System.out.println(authentication.isAuthenticated());
        return authentication.getName();
    }
}
