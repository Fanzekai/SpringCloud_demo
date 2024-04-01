package com.fzk.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author fzk
 * @date 2023/3/1 16:51
 */


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.fzk.springcloud"})
//@ComponentScan("com.fzk.springcloud")
public class FeignDeptConsumer_80 {

    public static void main(String[] args) {

        SpringApplication.run(FeignDeptConsumer_80.class,args);
    }

}
