package com.halo.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author Halo
 * @date Created in 2021/04/17 12:36 AM
 * @description
 */
// 1. 配置SpringBoot的包扫描
@SpringBootApplication(scanBasePackages = "com.halo.company")
// 2. 配置JPA注解的包扫描
@EntityScan(value = "com.halo.domain.company")
public class CompanyApplication {
    public static void main(String[] args) {
        SpringApplication.run(CompanyApplication.class, args);
    }
}
