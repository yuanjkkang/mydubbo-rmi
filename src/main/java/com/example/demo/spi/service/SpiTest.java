package com.example.demo.spi.service;

import java.util.ServiceLoader;

/**
 * @description:
 * @author: yjk
 * @create: 2018-12-22 23:04
 **/
public class SpiTest {
    public static void main(String[] args) {
        ServiceLoader<HelloWorldInterface> load = ServiceLoader.load(HelloWorldInterface.class);
        for (HelloWorldInterface helloWorldInterface : load) {
            String yjk = helloWorldInterface.sayHello("yjk");
            System.out.println(yjk);
        }
    }
}
