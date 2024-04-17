package org.example;

import net.sf.cglib.proxy.Enhancer;
import org.example.config.AppConfig;
import org.example.service.CglibProxyTest;
import org.example.service.ProxyInterface;
import org.example.service.ProxyTest;
import org.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
/*        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean("userService", UserService.class);
        AppConfig appConfig = context.getBean("appConfig", AppConfig.class);

        System.out.println(appConfig);

        userService.test();*/

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = context.getBean("userService", UserService.class);

        userService.test();
    }

}