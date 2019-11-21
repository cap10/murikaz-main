package com.cap10mycap10.murikaztenders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MurikazTendersApplication {

    public static void main(String[] args) {
        SpringApplication.run(MurikazTendersApplication.class, args);
    }

}
