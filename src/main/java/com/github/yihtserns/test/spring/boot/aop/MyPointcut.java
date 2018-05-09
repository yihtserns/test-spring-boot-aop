package com.github.yihtserns.test.spring.boot.aop;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;

/**
 * @author yihtserns
 */
public class MyPointcut implements org.springframework.aop.Pointcut {

    @Override
    public ClassFilter getClassFilter() {
        return (clazz) -> clazz == MyAdvised.class;
    }

    @Override
    public MethodMatcher getMethodMatcher() {
        return MethodMatcher.TRUE;
    }
}
