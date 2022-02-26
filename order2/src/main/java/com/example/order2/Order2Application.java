package com.example.order2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Order2Application {

    private static Logger logger = LoggerFactory.getLogger(Order2Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Order2Application.class, args);
    }

    @GetMapping("/order/{id}")
    public String findById(@PathVariable String id) {
        logger.info("order-service2");
        return "order" + id;
    }

}
