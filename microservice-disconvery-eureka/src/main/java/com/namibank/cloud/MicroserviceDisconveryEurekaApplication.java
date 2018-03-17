package com.namibank.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceDisconveryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDisconveryEurekaApplication.class, args);
	}
}
