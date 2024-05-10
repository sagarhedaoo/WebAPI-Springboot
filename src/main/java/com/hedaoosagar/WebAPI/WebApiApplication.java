package com.hedaoosagar.WebAPI;

import com.hedaoosagar.WebAPI.user.User;
import com.hedaoosagar.WebAPI.user.UserRestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class WebApiApplication {

    private static final Logger log = LoggerFactory.getLogger(WebApiApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WebApiApplication.class, args);
        log.info("Application started Successfully!");

    }

    @Bean
    CommandLineRunner runner(UserRestClient client) {
        return args -> {
            List<User> users = client.findAll();
            System.out.println(users);

            User user = client.findById(1);
            System.out.println(user);
        };
    }

}
