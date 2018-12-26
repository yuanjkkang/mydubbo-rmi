package com.example.demo.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

/**
 * @description:
 * @author: yjk
 * @create: 2018-12-21 14:39
 **/
public class HelloWorldHystrixCommand extends HystrixCommand<String> {
    private String name;
    public HelloWorldHystrixCommand(String name){
        super(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"));
        this.name = name;

    }
    @Override
    protected String run() throws Exception {
        return "hello"+name;
    }
}
