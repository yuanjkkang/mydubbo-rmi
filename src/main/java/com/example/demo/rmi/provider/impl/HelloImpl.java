package com.example.demo.rmi.provider.impl;

import com.example.demo.rmi.provider.Hello;

/**
 * @description:
 * @author: yjk
 * @create: 2018-12-20 09:38
 **/
public class HelloImpl implements Hello {
    @Override
    public String sayHello(String hello) {
        return "hello"+hello;
    }
}
