package com.github.yihtserns.test.spring.boot.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author yihtserns
 */
public class MyAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Going to do something");

        try {
            return methodInvocation.proceed();
        } finally {
            System.out.println("Done something");
        }
    }
}
