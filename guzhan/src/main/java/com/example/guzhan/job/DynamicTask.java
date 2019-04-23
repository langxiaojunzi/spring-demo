package com.example.guzhan.job;

import com.example.guzhan.GuzhanApplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import java.util.concurrent.ScheduledFuture;

/**
 * <p>create at 2019/4/23</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
@Component
@Scope("prototype")
@Slf4j
public class DynamicTask {

    @Autowired
    private ThreadPoolTaskScheduler threadPoolTaskScheduler;
    private ScheduledFuture future;

    public void startCron() {
        String cron = "0/1 * * * * ?";
        String name = Thread.currentThread().getName();
        log.info(name);
        future = threadPoolTaskScheduler.schedule(new myTask(name), new CronTrigger(cron));
        GuzhanApplication.map.put(name, future);
    }

    public void stop() {
        if (future != null) {
            future.cancel(true);
        }
    }

    private class myTask implements Runnable {
        private String name;

        myTask(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("test" + name);
        }
    }

}
