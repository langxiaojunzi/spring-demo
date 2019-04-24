package com.example.pattern.singleton;

/**
 * <p>create at 2019/4/23</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private String name;
    private static int times;

    public String getName() {
        return this.name;
    }

    private Singleton() {
        this.name = "Neo";
        System.out.println("单例构造器被调用"+(++times)+"次");
//        if (INSTANCE != null) {
//            throw new IllegalArgumentException("单例构造器不能重复使用");
//        }
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
