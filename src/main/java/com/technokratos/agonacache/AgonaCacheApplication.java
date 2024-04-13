package com.technokratos.agonacache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AgonaCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgonaCacheApplication.class, args);
    }

}
