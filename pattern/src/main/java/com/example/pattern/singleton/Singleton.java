package com.example.pattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * <p>create at 2019/4/23</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class Singleton implements Serializable {
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

    // 看这里,在反序列化的时候，JVM 会自动调用 readResolve() 这个方法，我们可以在这个方法中替换掉从流中反序列化回来的对象。
    // enum 类自带这种特殊光环，不用写 readResolve() 方法就可以自动防止反序列化方式对单例的破坏。
    public Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
}
