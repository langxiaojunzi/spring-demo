package com.example.pattern.proxy;

/**
 * <p>create at 2019/4/25</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class Implementation implements SomeMethods {
    public void boring1() {
        System.out.println("boring1");
    }

    public void boring2() {
        System.out.println("boring2");
    }

    public void interesting(String arg) {
        System.out.println("interesting " + arg);
    }

    public void boring3() {
        System.out.println("boring3");
    }
}
