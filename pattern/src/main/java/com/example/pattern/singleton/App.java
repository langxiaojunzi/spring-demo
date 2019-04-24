package com.example.pattern.singleton;

import java.lang.reflect.Constructor;

/**
 * <p>create at 2019/4/24</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class App {

    public static void main(String[] args) throws Exception {
//        Singleton2 instance1 = Singleton2.getInstance();
//        Singleton2 instance2 = Singleton2.getInstance();
//        System.out.println(instance1 == instance2);
//
//        Constructor constructor = Singleton2.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Singleton2 instance3 = (Singleton2)constructor.newInstance();
//        System.out.println(instance1 == instance3);

        Singleton3 ins = Singleton3.getInstance();
        Constructor constructor = Singleton3.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton3 ins1 = (Singleton3)constructor.newInstance();
        System.out.println(ins == ins1);
    }
}
