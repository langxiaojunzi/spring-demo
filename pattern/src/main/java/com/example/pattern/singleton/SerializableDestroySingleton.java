package com.example.pattern.singleton;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * <p>create at 2019/4/24</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class SerializableDestroySingleton {
    public static void main(String[] args) throws Exception {
        Singleton instance1 = Singleton.getInstance();

//        Constructor constructor = Singleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Singleton instance2 = (Singleton) constructor.newInstance();
//        System.out.println(instance1 == instance2);

        // instance3 将从 instance1 序列化后，反序列化而来
        Singleton instance3 = null;
        ByteArrayOutputStream bout;
        ObjectOutputStream out;
        try {
            bout = new ByteArrayOutputStream();
            out = new ObjectOutputStream(bout);
            out.writeObject(instance1);

            ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
            ObjectInputStream in = new ObjectInputStream(bin);
            instance3 = (Singleton) in.readObject();
        } catch (Exception e) {
        } finally {
            // close bout&out
        }

        // 显然，instance3 和 instance1 不是同一个对象了
        System.out.println(instance1 == instance3); // false
    }
}
