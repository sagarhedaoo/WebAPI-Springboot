package com.hedaoosagar.WebAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebApiApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(WebApiApplication.class, args);

		WelcomeMessage welcomeMessage = (WelcomeMessage) context.getBean("welcomeMessage");
		System.out.println(welcomeMessage);

	}

}
