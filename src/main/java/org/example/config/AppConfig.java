package org.example.config;

import org.example.service.OrderService;
import org.example.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.example")
public class AppConfig {

    @Bean
    public OrderService orderService1() {
        return new OrderService();
    }
}
