package com.example.pattern.singleton;

/**
 * <p>create at 2019/4/24</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class Singleton2 {
    // 首先，也是先堵死 new Singleton() 这条路
    private Singleton2() {}
    // 和饿汉模式相比，这边不需要先实例化出来，注意这里的 volatile，它是必须的
    private static volatile Singleton2 instance = null;

    public static Singleton2 getInstance() {
        // 双重检查，指的是两次检查 instance 是否为 null。
        if (instance == null) {
            // 这一次判断也是必须的，不然会有并发问题
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
