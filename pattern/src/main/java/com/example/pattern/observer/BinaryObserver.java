package com.example.pattern.observer;

/**
 * <p>create at 2019/5/16</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
