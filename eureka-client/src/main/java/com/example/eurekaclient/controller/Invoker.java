package com.example.eurekaclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class Invoker {

    private static Logger logger = LoggerFactory.getLogger(Invoker.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/invoke")
    public String invoke() {
        String serviceId = "ORDER-SERVICE";
        String endpoint = "/order/666";
        List<ServiceInstance> instances = discoveryClient.getInstances(serviceId);
        ServiceInstance serviceInstance = instances.get(0);
        ResponseEntity<String> forEntity = restTemplate.getForEntity(serviceInstance.getUri() + endpoint, String.class);
        return forEntity.getBody();
//        restTemplate.getForEntity()
    }
}