package com.objectia.JBD_HandsOnLearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableFeignClients
public class JbdHandsOnLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(JbdHandsOnLearningApplication.class, args);
	}

}
