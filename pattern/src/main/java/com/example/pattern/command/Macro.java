package com.example.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>create at 2019/4/26</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class Macro {

    // 命令发起者
    private final List<Action> actions;

    public Macro() {
        actions = new ArrayList<>();
    }

    public void record(Action action) {
        actions.add(action);
    }

    public void run() {
        actions.forEach(Action::perform);
    }
}
