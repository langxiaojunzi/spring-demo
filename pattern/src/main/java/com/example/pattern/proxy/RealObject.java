package com.example.pattern.proxy;

/**
 * <p>create at 2019/4/24</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class RealObject implements Interface {
    public void doSomething() {
        System.out.println("doSomething");
    }
    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }
}
