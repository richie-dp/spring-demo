package org.example.myproxy;

import java.lang.reflect.Method;

public interface MyInvocationHandler {
    Object invoke(Object proxy, Method method, Object[] params);
}
