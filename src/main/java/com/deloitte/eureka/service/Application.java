package com.deloitte.eureka.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

@SpringBootApplication
@EnableEurekaServer
public class Application {

	private final static Logger LOG = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {

		LOG.info("Starting eureka server...");
		SpringApplication.run(Application.class, args);
		LOG.info("Started eureka server.");

	}

}
