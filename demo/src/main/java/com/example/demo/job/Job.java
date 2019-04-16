package com.example.demo.job;

import com.example.demo.service.CacheService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import static com.example.demo.pojo.CommonConstants.KEY_OMS_TRADE_CANCEL;


/**
 * <p>create at 2019/4/15</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
@Component
@Slf4j
public class Job {
    @Autowired
    private CacheService cacheService;

    @Scheduled(cron = "0 */15 * * * *")
    public void tradeCancelOms() {
        log.info("向中台OMS同步取消订单JOB开始");
        new Operator(
                this.cacheService,
                KEY_OMS_TRADE_CANCEL,
                () -> {

                },
                "向OMS同步取消订单JOB取消：正有其他服务运行"
        ).operate();
    }
}
