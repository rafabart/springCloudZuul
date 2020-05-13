package com.springApiCustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringApiCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApiCustomerApplication.class, args);
	}

}
