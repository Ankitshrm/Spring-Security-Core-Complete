package com.springsecuritytut.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @GetMapping("/a_register")
    public String adminRegister(){
        return "adminRegister";
    }

    @GetMapping("/a_login")
    public String adminLogin(){
        return "adminLogin";
    }
}
