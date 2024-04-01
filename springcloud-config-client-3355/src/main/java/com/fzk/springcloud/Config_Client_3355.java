package com.fzk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author fzk
 * @version 1.0
 * @date 2023/4/30  14:58
 */
@SpringBootApplication
@EnableConfigServer
public class Config_Client_3355 {
    public static void main(String[] args) {
        SpringApplication.run(Config_Client_3355.class,args);
    }
}
