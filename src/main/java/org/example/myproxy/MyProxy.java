package org.example.myproxy;

import org.example.service.ProxyInterface;

public class MyProxy implements ProxyInterface {


    private MyInvocationHandler myInvocationHandler;

    public MyProxy(MyInvocationHandler myInvocationHandler) {
        this.myInvocationHandler = myInvocationHandler;
    }

    @Override
    public void a() {



    }
}
