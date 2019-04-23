package com.example.guzhan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;

@SpringBootApplication
@MapperScan("com.example.guzhan.mapper")
public class GuzhanApplication {

	// 线程存储器
	public static ConcurrentHashMap<String, ScheduledFuture> map = new ConcurrentHashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(GuzhanApplication.class, args);
	}

	// 创建线程
	@Bean
	public ThreadPoolTaskScheduler threadPoolTaskScheduler() {
		ThreadPoolTaskScheduler executor = new ThreadPoolTaskScheduler();
		executor.setPoolSize(20);
		executor.setThreadNamePrefix("taskExecutor-");
		executor.setWaitForTasksToCompleteOnShutdown(true);
		executor.setAwaitTerminationSeconds(60);
		return executor;
	}

}
