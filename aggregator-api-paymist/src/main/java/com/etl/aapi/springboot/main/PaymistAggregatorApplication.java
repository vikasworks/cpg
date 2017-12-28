package com.etl.aapi.springboot.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.etl.aapi.springframework.ApplicationContextProvider;

@SpringBootApplication
@ComponentScan(basePackages="com.etl")
public class PaymistAggregatorApplication {
	@SuppressWarnings("unused")
	private static final Logger log = LogManager.getLogger(PaymistAggregatorApplication.class);

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(PaymistAggregatorApplication.class);
		application.setBannerMode(Mode.OFF);
		ApplicationContextProvider.setApplicationContext(application.run(args));
	}
}
