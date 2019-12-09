package com.cap10mycap10.jwpetstoreexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class JwpetstoreexampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwpetstoreexampleApplication.class, args);
    }

}
