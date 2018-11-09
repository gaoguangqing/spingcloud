package com.spoon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication
@EnableEurekaServer//标识EurkaServer
public class RunAppEurekaServer {
	public static void main(String[] args) {
		SpringApplication.run(RunAppEurekaServer.class, args);
	}
}
