package com.fzk.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author fzk
 * @version 1.0
 * @date 2023/3/13  22:29
 */

@Configuration
public class fzkRule {



    @Bean
    public IRule myRule(){

        return new fzkRandomRule();
    }
}
