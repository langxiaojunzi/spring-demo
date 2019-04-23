package com.example.netty.pattern;

/**
 * <p>create at 2019/4/23</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private String name;

    public String getName() {
        return this.name;
    }

    private Singleton() {
        this.name = "Neo";
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
