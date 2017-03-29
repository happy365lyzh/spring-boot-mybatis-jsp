package com.liu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.liu.dao"})
public class DemoApplication {
	//日了狗，yml里面没有basePackages选项配置，只能这样来写
	//@MapperScan(basePackages = {"com.liu.dao"})

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
