package com.fzk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author fzk
 * @version 1.0
 * @date 2023/3/5  12:31
 */

@SpringBootApplication
@EnableEurekaServer// @EnableEurekaServer 服务端的启动类，可以接受别人注册进来~
public class EurekaServer_7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7002.class,args);
    }
}