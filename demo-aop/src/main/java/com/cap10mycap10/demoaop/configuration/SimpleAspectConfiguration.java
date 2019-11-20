package com.cap10mycap10.demoaop.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.cap10mycap10.demoaop.aop")
public class SimpleAspectConfiguration {
}
