package com.example.pattern.chain;

/**
 * <p>create at 2019/5/14</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class LocationRuleHandler extends RuleHandler {
    private final ActivityService activityService;
    public LocationRuleHandler(ActivityService activityService) {
        this.activityService = activityService;
    }

    public void apply(Context context) {
        boolean allowed = activityService.isSupportedLocation(context.getLocation());
        if (allowed) {
            if (this.getSuccessor() != null) {
                this.getSuccessor().apply(context);
            }
        } else  {
            throw new RuntimeException("非常抱歉，您所在的地区无法参与本次活动");
        }
    }
}
