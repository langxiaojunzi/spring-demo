package com.example.pattern.observer;

/**
 * <p>create at 2019/5/16</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
