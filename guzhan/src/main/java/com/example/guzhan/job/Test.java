package com.example.guzhan.job;

import com.example.guzhan.GuzhanApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ScheduledFuture;

/**
 * <p>create at 2019/4/23</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
@RestController
public class Test {

    @Autowired
    private DynamicTask task;
    @RequestMapping("/task")
    public void test() {
        // 开启定时任务，对象注解Scope是多利的。
        task.startCron();

    }
    @RequestMapping("/stop")
    public void stop() throws Exception{
        // 提前测试用来测试线程1进行对比是否关闭。
        ScheduledFuture scheduledFuture = GuzhanApplication.map.get("http-nio-9527-exec-1");
        scheduledFuture.cancel(true);
        // 查看任务是否在正常执行之前结束,正常true
        boolean cancelled = scheduledFuture.isCancelled();
        while (!cancelled) {
            scheduledFuture.cancel(true);
        }
    }

}
