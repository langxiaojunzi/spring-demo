package com.example.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <p>create at 2019/4/25</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class MethodSelector implements InvocationHandler {
    private Object proxied;

    public MethodSelector(Object proxied) {
        this.proxied = proxied;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before ------");
        System.out.println("method:" + method);
        if (method.getName().equals("interesting"))
            System.out.println("Proxy detected the interesting method");
        method.invoke(proxied, args);
        System.out.println("after =========");
        return null;
    }
}
