package com.example.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * <p>create at 2019/4/24</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class SimpleDynamicProxy {

    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

//    public static void main(String[] args) {
//        RealObject real = new RealObject();
//        consumer(real);
//        System.out.println("--------------动态代理--------------");
//        // Insert a proxy and call again:
//        Interface proxy = (Interface) Proxy.newProxyInstance(
//                Interface.class.getClassLoader(),
//                new Class[]{Interface.class},
//                new DynamicProxyHandler(real));
//        consumer(proxy);
//    }


    public static void main(String[] args) {
        RealObject real = new RealObject();
        InvocationHandler handler = new DynamicProxyHandler(real);
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                real.getClass().getInterfaces(),
                handler);
        proxy.doSomething();
        proxy.somethingElse("hello, world!!");
    }

}
