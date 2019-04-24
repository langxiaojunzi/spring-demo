package com.example.pattern.singleton;

/**
 * <p>create at 2019/4/24</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class Singleton3 {

    private Singleton3() {}

    private static class Holder {
        private static Singleton3 intance = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return Holder.intance;
    }
}
