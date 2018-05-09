package com.github.yihtserns.test.spring.boot.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author yihtserns
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);

        Runnable advised = context.getBean(Runnable.class);
        advised.run();
    }
}
