package com.yoodb.study.nacos.demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务注册
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SCNSDemo01Application {

	public static void main(String[] args) {
		SpringApplication.run(SCNSDemo01Application.class, args);

	}

}
