package com.example.demo.utils;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Properties {

    @Value("${url.auth-api}")
    String authApi;
    @Value("${spring.config.activate.onProfile}")
    String env;

    @Test
    void test(){
        System.out.println(env);
        System.out.println(authApi);
    }
}
