package com.example.demo.rmi.consumer;

import com.example.demo.rmi.provider.Hello;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @description:
 * @author: yjk
 * @create: 2018-12-20 09:50
 **/
public class TestConsumer {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry(8099);
        Hello hello = (Hello) registry.lookup("hello");
        String aaaaa = hello.sayHello("aaaaa");
        System.out.println(aaaaa);

    }
}
