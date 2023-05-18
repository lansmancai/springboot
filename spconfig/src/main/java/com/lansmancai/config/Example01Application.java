package com.lansmancai.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Example01Application {
    private static final Logger LOG = LoggerFactory.getLogger(Example01Application.class);
    public static void main(String[] args) {
        SpringApplication.run(Example01Application.class, args);
    }

}
