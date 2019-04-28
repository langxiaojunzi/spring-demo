package com.example.pattern.command2;

/**
 * <p>create at 2019/4/28</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public interface Command {

    void execute();

    void undo();
}
