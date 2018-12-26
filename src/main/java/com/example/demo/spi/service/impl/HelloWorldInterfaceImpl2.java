package com.example.demo.spi.service.impl;

import com.example.demo.spi.service.HelloWorldInterface;

/**
 * @description:
 * @author: yjk
 * @create: 2018-12-22 23:07
 **/
public class HelloWorldInterfaceImpl2 implements HelloWorldInterface {
    @Override
    public String sayHello(String name) {
        return "你好！"+name;
    }
}
