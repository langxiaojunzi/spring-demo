package com.example.pattern.proxy;

/**
 * <p>create at 2019/4/24</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String[] args) {
        consumer(new RealObject());
        System.out.println("==============================");
        consumer(new SimpleProxy(new RealObject()));
    }
}
