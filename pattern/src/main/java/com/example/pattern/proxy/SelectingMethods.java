package com.example.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * <p>create at 2019/4/25</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class SelectingMethods {
    public static void main(String[] args) {
        Implementation real = new Implementation();
        InvocationHandler handler = new MethodSelector(real);

        SomeMethods proxy = (SomeMethods) Proxy.newProxyInstance(
                SomeMethods.class.getClassLoader(),
//                new Class[]{SomeMethods.class},
                real.getClass().getInterfaces(),
//                new MethodSelector(new Implementation()));
                handler);
        System.out.println(proxy.getClass().getName());
        proxy.boring1();
        proxy.boring2();
        proxy.interesting("bonobo");
        proxy.boring3();
    }
}
