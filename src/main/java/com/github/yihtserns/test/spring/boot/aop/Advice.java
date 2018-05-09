package com.github.yihtserns.test.spring.boot.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author yihtserns
 */
@Aspect
@Component
public class Advice {

    @Around("execution(* com.github.yihtserns.test.spring.boot.aop.Advised.run())")
    public void interceptDoSomething(ProceedingJoinPoint jointPoint) throws Throwable {
        System.out.println("Going to do something");

        jointPoint.proceed();

        System.out.println("Done something");
    }
}
