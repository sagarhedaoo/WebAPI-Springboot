package com.hedaoosagar.WebAPI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApiApplication {

    private static final Logger log = LoggerFactory.getLogger(WebApiApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WebApiApplication.class, args);
        log.info("Application started Successfully!");

    }

//    @Bean
//    CommandLineRunner runner(RunRepository runRepository) {
//        return args -> {
//            Run run = new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 3, Location.OUTDOOR);
//            runRepository.create(run);
//        };
//    }

}
