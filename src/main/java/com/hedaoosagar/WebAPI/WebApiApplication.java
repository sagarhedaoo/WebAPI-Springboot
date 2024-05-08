package com.hedaoosagar.WebAPI;

import com.hedaoosagar.WebAPI.run.Location;
import com.hedaoosagar.WebAPI.run.Run;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class WebApiApplication {

	private static final Logger log = LoggerFactory.getLogger(WebApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WebApiApplication.class, args);
		log.info("Application started Successfully!");

	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Run run = new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 3, Location.OUTDOOR);
			log.info("Run: " + run);
		};
	}

}
