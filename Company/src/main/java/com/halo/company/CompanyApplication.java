package com.halo.company;

import com.halo.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

/**
 * @author Halo
 * @date Created in 2021/04/17 12:36 AM
 * @description
 */
// 1. 配置SpringBoot的包扫描
@SpringBootApplication(scanBasePackages = "com.halo")
// 2. 配置JPA注解的包扫描
@EntityScan(value = "com.halo.domain.company")
public class CompanyApplication {
    public static void main(String[] args) {
        SpringApplication.run(CompanyApplication.class, args);
    }

    @Bean
    public IdWorker idWorker() {
        return new IdWorker();
    }
}
