package com.example.guzhan.listener;

import com.example.guzhan.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * <p>created at 2019/11/15</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
@Component
@Order(value = 1)
public class FileInitRun implements CommandLineRunner {

    @Autowired
    DeptService locationService;

    @Override
    public void run(String... args) throws Exception {
        //解决listener注入不了spring容器对象的问题
        FileListener.setLocationService(locationService);
    }

}
