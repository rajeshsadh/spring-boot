package com.spring.boot.activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ActiveMqApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActiveMqApplication.class, args);
	}

}
