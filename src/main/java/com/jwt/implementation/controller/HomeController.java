package com.jwt.implementation.controller;


import ch.qos.logback.core.net.SyslogOutputStream;
import com.jwt.implementation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jwt.implementation.model.User;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getUser(){
        System.out.println("user details");
        return  userService.getUser();
    }
}
