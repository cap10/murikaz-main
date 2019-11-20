package com.cap10mycap10.demoaop.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class TracingAspect {

    public boolean isEnteringCalled(){
        return enteringCalled;
    }

    Logger logger = Logger.getLogger(TracingAspect.class.getName());
    boolean enteringCalled = false;


    @Before("execution(void doSomething())")
    public void entering(JoinPoint joinPoint){
        enteringCalled= true;
        logger.info("entering " + joinPoint.getStaticPart().getSignature().toString());
    }
}