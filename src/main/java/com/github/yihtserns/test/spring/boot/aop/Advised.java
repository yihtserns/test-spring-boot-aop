package com.github.yihtserns.test.spring.boot.aop;

import org.springframework.stereotype.Component;

/**
 * @author yihtserns
 */
@Component
public class Advised implements Runnable {

    @Override
    public void run() {
        System.out.println("Doing something");
    }
}
