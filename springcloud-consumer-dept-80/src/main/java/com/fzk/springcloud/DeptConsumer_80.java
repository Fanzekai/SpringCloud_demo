package com.fzk.springcloud;

import com.fzk.myrule.fzkRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author fzk
 * @date 2023/3/1 16:51
 */


@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name ="springcloud-provider-dept",configuration = fzkRule.class)
public class DeptConsumer_80 {

    public static void main(String[] args) {

        SpringApplication.run(DeptConsumer_80.class,args);
    }

}
