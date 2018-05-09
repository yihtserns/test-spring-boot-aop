package com.github.yihtserns.test.spring.boot.aop;

/**
 * @author yihtserns
 */
public class MyAdvised implements Runnable {

    @Override
    public void run() {
        System.out.println("Doing something");
    }
}
