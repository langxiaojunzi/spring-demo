package com.example.pattern.prototype;

import java.util.Hashtable;

/**
 * <p>create at 2019/5/15</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class ShapeCache {
    // 使用者角色：维护一个注册表，并提供一个找出正确实例原型的方法。
    // 最后，提供一个获取新实例的方法，用来委托复制实例的方法生成新实例。
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    // 提供一个获取新实例的方法
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId); // 提供一个找出正确实例原型的方法
        return (Shape) cachedShape.clone(); // 委托复制实例的方法生成新实例。
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
