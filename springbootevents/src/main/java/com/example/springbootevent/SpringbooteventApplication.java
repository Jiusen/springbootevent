package com.example.springbootevent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class SpringbooteventApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbooteventApplication.class, args);
    }

}
