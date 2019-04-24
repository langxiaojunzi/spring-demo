package com.example.pattern.singleton;

/**
 * <p>create at 2019/4/24</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public enum SingletonEnum {
    INSTANCE,
    ;
    private String name;

    SingletonEnum() {
        this.name = "Neo";
    }

    public static SingletonEnum getInstance() {
        return INSTANCE;
    }

    public String getName() {
        return this.name;
    }
}
