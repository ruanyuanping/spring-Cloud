package com.namibank.clound;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceNamibankProviderUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceNamibankProviderUserApplication.class, args);
	}
}
