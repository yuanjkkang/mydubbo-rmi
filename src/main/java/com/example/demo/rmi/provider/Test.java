package com.example.demo.rmi.provider;

import com.example.demo.rmi.provider.impl.HelloImpl;

import java.io.IOException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @description:
 * @author: yjk
 * @create: 2018-12-20 09:39
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        //初始化服务实例
        Hello hello = new HelloImpl();
        //将服务实例生成可以与服务端通信的stub对象
        Hello stub = (Hello) UnicastRemoteObject.exportObject(hello,1996);
        //创建一个本地rmi服务监听8099端口，该注册服务运行在服务端
        Registry registry = LocateRegistry.createRegistry(8099);
        //将stub对象绑定到注册服务上
        registry.rebind("hello",stub);
        System.in.read();
    }
}
