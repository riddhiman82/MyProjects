package com.rk.spring.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringConfigLoadingApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringConfigLoadingApplication.class, args);
		System.out.println("############################################");
		System.out.println("First Name: " + applicationContext.getBean("firstName"));
		System.out.println("Last Name: " + applicationContext.getBean("lastName"));
		System.out.println("Location: " + applicationContext.getBean("location"));
		System.out.println("############################################");
	}
}
