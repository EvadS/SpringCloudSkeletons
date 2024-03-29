package com.sample.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class SchoolServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolServiceApplication.class, args);
    }

}
