package com.portal.job_utils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JobUtilsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobUtilsApplication.class, args);
	}

}
