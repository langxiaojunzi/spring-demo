package com.example.pattern.chain;

/**
 * <p>create at 2019/5/14</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class LimitRuleHandler extends RuleHandler {
    private final ActivityService activityService;
    public LimitRuleHandler(ActivityService activityService) {
        this.activityService = activityService;
    }

    public void apply(Context context) {
        int remainedTimes = activityService.queryRemainedTimes(context); // 查询剩余奖品
        if (remainedTimes > 0) {
            if (this.getSuccessor() != null) {
                this.getSuccessor().apply(context);
            }
        } else {
            throw new RuntimeException("您来得太晚了，奖品被领完了");
        }
    }
}
