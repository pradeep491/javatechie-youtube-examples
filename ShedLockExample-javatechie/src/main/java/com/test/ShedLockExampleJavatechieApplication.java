package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ShedLockExampleJavatechieApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShedLockExampleJavatechieApplication.class, args);
    }
}
