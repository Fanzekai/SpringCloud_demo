package com.fzk.springcloud.ConfigBean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author fzk
 * @date 2023/3/116:21
 */
@Configuration
public class ConfigBean {
    //@Configuration -- spring  applicationContext.xml
    @LoadBalanced //配置负载均衡实现RestTemplate
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


}