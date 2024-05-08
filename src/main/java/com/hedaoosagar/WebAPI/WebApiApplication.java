package com.hedaoosagar.WebAPI;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebApiApplication {

	private static final Logger log = LoggerFactory.getLogger(WebApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WebApiApplication.class, args);
		log.info("Application started Successfully!");

	}

}
