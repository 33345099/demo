package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo.dao")
public class DemoApplication {

	public static void main(String[] args) {
		
		String a = null;
		a.toString();
		SpringApplication.run(DemoApplication.class, args);
	}
}
