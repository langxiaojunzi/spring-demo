package com.example.pattern.singleton;

/**
 * <p>create at 2019/4/28</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class MySingleton {
//    private static MySingleton instance = null;
//
//    private MySingleton() {
//    }

    // 方法中申明 synchronized 关键字
//    public synchronized static MySingleton getInstance() {
//        try {
//            if (instance != null) {//懒汉式
//
//            } else {
//                //创建实例之前可能会有一些准备性的耗时工作
//                Thread.sleep(500);
//                instance = new MySingleton();
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return instance;
//    }

    //  同步方法块实现
//    public static MySingleton getInstance() {
//        try {
//            synchronized (MySingleton.class) {
//                if (instance != null) {//懒汉式
//                } else {
//                    //创建实例之前可能会有一些准备性的耗时工作
//                    Thread.sleep(300);
//                    instance = new MySingleton();
//                }
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return instance;
//    }

    // 针对某些重要的代码进行单独的同步，而不是全部进行同步，可以极大的提高执行效率,
    //  代码的运行效率是能够得到提升，但是却没能保住线程的安全性
    // 单独同步方式
//    public static MySingleton getInstance() {
//        try {
//            if (instance != null) {//懒汉式
//            } else {
//                //创建实例之前可能会有一些准备性的耗时工作
//                Thread.sleep(300);
//                synchronized (MySingleton.class) {
//                    instance = new MySingleton();
//                }
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return instance;
//    }

    // 为了达到线程安全，又能提高代码执行效率，我们这里可以采用 DCL 的双检查锁机制来完成
    // 双检查锁机制
    //使用 volatile 关键字保其可见性
//    volatile private static MySingleton instance = null;
//    public static MySingleton getInstance() {
//        try {
//            if (instance != null) {//懒汉式
//            } else {
//                // 创建实例之前可能会有一些准备性的耗时工作
//                Thread.sleep(300);
//                synchronized (MySingleton.class) {
//                    if (instance == null) { // 二次检查
//                        instance = new MySingleton();
//                    }
//                }
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return instance;
//    }

    //内部类  静态内置类方式
    private static class MySingletonHandler{
        private static MySingleton instance = new MySingleton();
    }
    private MySingleton(){}
    public static MySingleton getInstance() {
        return MySingletonHandler.instance;
    }

}
