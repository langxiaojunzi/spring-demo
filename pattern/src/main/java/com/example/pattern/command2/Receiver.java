package com.example.pattern.command2;

/**
 * <p>create at 2019/4/28</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class Receiver {
    public void action() {
        System.out.println("执行命令...");
    }

    public void unAction() {
        System.out.println("撤销命令...");
    }
}
