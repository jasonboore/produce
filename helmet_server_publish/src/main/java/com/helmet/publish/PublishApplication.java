package com.helmet.publish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * emqx 发布者（生产者）的启动程序
 */
@SpringBootApplication
public class PublishApplication {

    public static void main(String[] args) {
        SpringApplication.run(PublishApplication.class, args);
    }
}
