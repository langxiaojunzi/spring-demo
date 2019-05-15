package com.example.pattern.prototype;

/**
 * <p>create at 2019/5/15</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public abstract class Shape implements Cloneable {
    // 原型角色：定义用于复制现有实例来生成新实例的方法；
    // 1.（抽象类或者接口）实现 java.lang.Cloneable 接口
    // 2.定义复制现有实例来生成新实例的方法
    private String id;
    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // 具体原型角色：实现用于复制现有实例来生成新实例的方法
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
