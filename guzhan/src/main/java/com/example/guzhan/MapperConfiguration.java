package com.example.guzhan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>create at 2019/4/19</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
@Configuration
@MapperScan({
        "com.example.guzhan.mapper"
})
public class MapperConfiguration {
}
