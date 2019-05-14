package com.example.pattern.chain;

/**
 * <p>create at 2019/5/14</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public abstract class RuleHandler {

    // 后继节点
    protected RuleHandler successor;

    public abstract void apply(Context context);

    public void setSuccessor(RuleHandler successor) {
        this.successor = successor;
    }
    public RuleHandler getSuccessor() {
        return successor;
    }
}
