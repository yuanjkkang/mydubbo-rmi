package com.example.demo.spi.service.impl;

import com.example.demo.spi.service.HelloWorldInterface;

/**
 * @description:
 * @author: yjk
 * @create: 2018-12-22 22:59
 **/
public class HelloWorldInterfaceImpl implements HelloWorldInterface {
    @Override
    public String sayHello(String name) {
        return "hello "+name;
    }
}
