package com.lishuo;

import com.lishuo.service.UserService;
import com.lishuo.service.UserServiceImpl;
import com.spring.LsApplicationContext;

public class Test {

    public static void main(String[] args) {
        LsApplicationContext lsApplicationContext = new LsApplicationContext(AppConfig.class);

        UserService userService = (UserService) lsApplicationContext.getBean("userService");
        userService.test();

    }
}
