package com.eureka.myeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MyeurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyeurekaserverApplication.class, args);
	}

}
