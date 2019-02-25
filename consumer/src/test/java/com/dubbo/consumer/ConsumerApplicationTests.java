package com.dubbo.consumer;

import com.dubbo.consumer.controller.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumerApplicationTests {

    private UserController userController;

    @Test
    public void contextLoads()throws Exception {
        userController.getUserInfo();
    }

}

