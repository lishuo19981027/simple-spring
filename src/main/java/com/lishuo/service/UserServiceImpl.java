package com.lishuo.service;

import com.spring.*;

@Component("userService")
//@Scope("singleton")
public class UserServiceImpl implements BeanNameAware, InitializingBean ,UserService{

    @Autowired
    private OrderService orderService;

    private String beanName;

    private String Name;

    public void setName(String name) {
        Name = name;
    }

    @Override
    public void setBeanName(String name) {
        beanName = name;
    }

    public void test(){
        System.out.println(orderService);
        System.out.println(beanName);
        System.out.println(Name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化");
    }
}
