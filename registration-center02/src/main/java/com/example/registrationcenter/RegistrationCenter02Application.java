package com.example.registrationcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegistrationCenter02Application {

    public static void main(String[] args) {
        SpringApplication.run(RegistrationCenter02Application.class, args);
    }
}
