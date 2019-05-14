package com.example.pattern.chain;

/**
 * <p>create at 2019/5/14</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public interface ActivityService {
    int queryRemainedTimes(Context context);
    boolean isSupportedLocation(String location);
}
