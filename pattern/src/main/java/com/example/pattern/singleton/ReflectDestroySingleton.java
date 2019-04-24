package com.example.pattern.singleton;

import java.lang.reflect.Constructor;

/**
 * <p>create at 2019/4/23</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class ReflectDestroySingleton {

    public static void main(String[] args) throws Exception {
        // 由于构造方法上加了 private 修饰，所以我们已经不能通过 ‘new’ 来产生实例了
        // Singleton intance = new Singleton();
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
        System.out.println(instance.getName());
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1);
        System.out.println(instance1.getName());

        // 下面我们通过反射得到其构造方法，并且修改其构造方法的访问权限，并用这个构造方法构造一个对象
        Constructor constructor = Singleton.class.getDeclaredConstructor();
//        Class<Singleton> singletonClass = Singleton.class;
//        Constructor<Singleton> constructor = singletonClass.getDeclaredConstructor();

        //设置在使用构造器的时候不执行权限检查
        constructor.setAccessible(true);
        //由于没有了权限检查，所以在Singleton类外面也可以创建对象了
        Singleton instance2  = (Singleton) constructor.newInstance();
        System.out.println(instance2);
        System.out.println(instance2.getName());
        // 是不是产生了两个实例了？
        System.out.println(instance1 == instance2); // false


        // 对于枚举，JVM 会自动进行实例的创建，其构造方法由 JVM 在创建实例的时候进行调用。
        // 我们在代码中是获取不到 enum 类的构造方法的
//        SingletonEnum singletonEnum = SingletonEnum.getInstance();
//        System.out.println(singletonEnum.getName());
//        Constructor constructor1 = SingletonEnum.class.getDeclaredConstructor();
//        constructor1.setAccessible(true);
//        SingletonEnum singletonEnum1 = (SingletonEnum) constructor1.newInstance();
//        System.out.println(singletonEnum == singletonEnum1);
    }
}
