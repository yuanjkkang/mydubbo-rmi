package com.example.demo.hystrix.test;

import com.example.demo.hystrix.HelloWorldHystrixObservableCommand;
import rx.Observable;
import rx.Subscriber;

/**
 * @description:
 * @author: yjk
 * @create: 2018-12-21 14:53
 **/
public class HelloWorldHystrixObservableCommandTest {
    public static void main(String[] args) {
        Observable<String> observable = new HelloWorldHystrixObservableCommand("yjk").observe();
        observable.subscribe(new Subscriber<String>() {
            @Override
            public void onCompleted() {
                System.out.println("complete");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("error"+throwable);
            }

            @Override
            public void onNext(String s) {
                System.out.println("next============="+s);
            }
        });

    }
}
