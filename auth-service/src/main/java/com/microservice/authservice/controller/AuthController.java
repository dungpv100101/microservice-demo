package com.microservice.authservice.controller;

import com.microservice.authservice.dto.LoginRequest;
import com.microservice.authservice.dto.LogoutRequest;
import com.microservice.authservice.service.KeycloakRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {
    @Autowired
    private KeycloakRestService restService;

    @GetMapping(value = "healthCheck")
    public String healthCheck() {
        return "Good";
    }
    @PostMapping(value = "/login", produces = {"application/json"})
    public String login(@RequestBody LoginRequest loginRequest) {
        return restService.login(loginRequest);
    }

    @PostMapping(value = "/logout")
    public String login(@RequestBody LogoutRequest logoutRequest) {
        return restService.logout(logoutRequest);
    }
}
