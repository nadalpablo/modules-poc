package com.pocs.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.pocs.controller", "com.pocs.service"})
@EnableMongoRepositories(basePackages = "com.pocs.repository")
public class ModulesPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModulesPocApplication.class, args);
    }
}