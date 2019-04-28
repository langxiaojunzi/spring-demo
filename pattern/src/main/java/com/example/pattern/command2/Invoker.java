package com.example.pattern.command2;

/**
 * <p>create at 2019/4/28</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class Invoker {
    /**
     * 调用者持有命令对象
     */
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 执行命令
     */
    public void runCommand() {
        command.execute();
    }

    /**
     * 撤销命令
     */
    public void unDoCommand() {
        command.undo();
    }
}
