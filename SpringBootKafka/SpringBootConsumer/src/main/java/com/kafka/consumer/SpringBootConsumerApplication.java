package com.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConsumerApplication.class, args);

		Logger logger =  LoggerFactory.getLogger("");
		logger.info("holis");
	}
}
