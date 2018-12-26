package com.example.demo.hystrix.test;

import com.example.demo.hystrix.HelloWorldHystrixCommand;

/**
 * @description:
 * @author: yjk
 * @create: 2018-12-21 14:42
 **/
public class HelloWorldHystrixCommandTest {
    public static void main(String[] args) {
        String yjk = new HelloWorldHystrixCommand("yjk").execute();
        System.out.println(yjk);
    }
}
