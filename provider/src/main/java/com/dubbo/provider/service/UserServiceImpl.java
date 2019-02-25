package com.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.dobbo.commom.UserService;
import com.dobbo.commom.UserEntity;

/**
 * 对公共服务接口的实现
 */
@org.springframework.stereotype.Service
@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserEntity getUserInfo() {
        UserEntity user = new UserEntity();
        user.setId(1);
        user.setIcon("头像图标路径");
        user.setLoginpwd("2019666");
        user.setLoginstate(1);
        user.setMail("chevysky@163.com");
        user.setNickname("chevysky");
        user.setTelnumber("18181779032");
        user.setUsername("chevysky");
        user.setWechat("80808080");
        return user;
    }
}
