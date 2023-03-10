package com.springboot.firstproject.service;

import org.springframework.stereotype.Component;

@Component // It is used to create the object of the class dynamically
public class LoginService {
    public boolean validateUser(String name, String password) {
        return name.equalsIgnoreCase("ajar") && password.equalsIgnoreCase("123");
    }

}
