package com.ltts.HMS_Microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HmsMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HmsMicroservicesApplication.class, args);
	}

}
