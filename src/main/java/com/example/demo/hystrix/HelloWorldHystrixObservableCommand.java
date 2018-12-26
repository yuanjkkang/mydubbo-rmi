package com.example.demo.hystrix;

import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixObservableCommand;
import rx.Observable;
import rx.Subscriber;

/**
 * @description:
 * @author: yjk
 * @create: 2018-12-21 14:46
 **/
public class HelloWorldHystrixObservableCommand extends HystrixObservableCommand<String> {
    private String name;
    public HelloWorldHystrixObservableCommand(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("ExampleGroup1"));
        this.name = name;
    }

    @Override
    protected Observable<String> construct() {
        System.out.println("in construce thread"+Thread.currentThread().getName());

        return Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                try {
                    if(!subscriber.isUnsubscribed()){
                        subscriber.onNext("hello1 thread"+Thread.currentThread().getName());
                        subscriber.onNext("hello2 thread"+Thread.currentThread().getName());
                        subscriber.onNext(name+"===thread"+Thread.currentThread().getName());
                        System.out.println("complete before thread"+Thread.currentThread().getName());
                        subscriber.onCompleted();
                        System.out.println("complete after thread"+Thread.currentThread().getName());
                    }
                }catch (Exception e){
                    subscriber.onError(e);
                }

            }
        });
    }
}
