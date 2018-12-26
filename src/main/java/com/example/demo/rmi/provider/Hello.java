package com.example.demo.rmi.provider;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @description:
 * @author: yjk
 * @create: 2018-12-20 09:38
 **/
public interface Hello extends Remote {
    String sayHello(String hello)throws RemoteException;
}
