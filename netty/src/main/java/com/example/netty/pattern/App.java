package com.example.netty.pattern;

import java.lang.reflect.Constructor;

/**
 * <p>create at 2019/4/23</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class App {

    public static void main(String[] args) throws Exception {
        // 由于构造方法上加了 private 修饰，所以我们已经不能通过 ‘new’ 来产生实例了
        // Singleton intance = new Singleton();

        Singleton instance = Singleton. getInstance();
        System.out.println(instance.getName());


        Singleton instance1 = Singleton.getInstance();

        // 下面我们通过反射得到其构造方法，并且修改其构造方法的访问权限，并用这个构造方法构造一个对象
        Constructor constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton instance2  = (Singleton) constructor.newInstance();

        // 是不是产生了两个实例了？
        System.out.println(instance1 == instance2); // false
    }
}
