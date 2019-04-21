package com.example.guzhan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.guzhan.mapper")
public class GuzhanApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuzhanApplication.class, args);
	}

}
