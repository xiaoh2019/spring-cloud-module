package com.cyzs.concumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ConcumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConcumerFeignApplication.class, args);
	}

}
