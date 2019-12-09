package com.cap10mycap10.murikazrestapi.config;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    BasicAuthRequestInterceptor requestInterceptor(){
        return new BasicAuthRequestInterceptor("user", "&?s]8WBs=n");
    }
}
