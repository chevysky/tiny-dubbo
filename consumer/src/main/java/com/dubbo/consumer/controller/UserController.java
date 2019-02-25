package com.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dobbo.commom.UserEntity;
import com.dobbo.commom.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping(value = "/info")
    public UserEntity getUserInfo()throws Exception{
        UserEntity user = userService.getUserInfo();
        System.out.println(user);
        return user;
    }
}
