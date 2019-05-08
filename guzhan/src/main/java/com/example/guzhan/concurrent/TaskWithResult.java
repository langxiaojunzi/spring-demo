package com.example.guzhan.concurrent;

import java.util.concurrent.Callable;

/**
 * <p>create at 2019/5/8</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class TaskWithResult implements Callable<String> {
    // 实现Callable接口，从任务中产生返回值

    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    public String call() {
        return "result of TaskWithResult " + id;
    }
}
