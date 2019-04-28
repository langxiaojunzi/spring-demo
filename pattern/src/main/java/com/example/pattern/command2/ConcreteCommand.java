package com.example.pattern.command2;

/**
 * <p>create at 2019/4/28</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class ConcreteCommand implements Command {
    // 命令要求的功能的真正实现者
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }

    @Override
    public void undo() {
        receiver.unAction();
    }
}
