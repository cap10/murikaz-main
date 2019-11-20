package com.cap10mycap10.democloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemoCloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCloudConfigApplication.class, args);
    }

}
