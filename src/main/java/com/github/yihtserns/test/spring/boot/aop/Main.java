package com.github.yihtserns.test.spring.boot.aop;

import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author yihtserns
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class Main {

    @Bean
    public DefaultPointcutAdvisor pointcutAdvisor() {
        return new DefaultPointcutAdvisor(pointcut(), advice());
    }

    @Bean
    public MyPointcut pointcut() {
        return new MyPointcut();
    }

    @Bean
    public MyAdvice advice() {
        return new MyAdvice();
    }

    @Bean
    public MyAdvised advised() {
        return new MyAdvised();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);

        Runnable advised = context.getBean(Runnable.class);
        advised.run();
    }
}
