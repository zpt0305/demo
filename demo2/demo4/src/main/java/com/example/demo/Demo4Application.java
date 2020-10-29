package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Demo4Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo4Application.class, args);
		System.out.println("demo4启动成功");
	}

}
