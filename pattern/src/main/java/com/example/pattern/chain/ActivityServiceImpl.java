package com.example.pattern.chain;

/**
 * <p>create at 2019/5/14</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class ActivityServiceImpl implements ActivityService {

    @Override
    public int queryRemainedTimes(Context context) {
        return 1000;
    }

    @Override
    public boolean isSupportedLocation(String location) {
        return true;
    }
}
