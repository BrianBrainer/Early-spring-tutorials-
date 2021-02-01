package com.ryan.springboot.web.springbootsimplewebapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //initializes Spring(Component Scan) and Spring Boot (Auto Configuration)
public class SpringBootSimpleWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSimpleWebApplication.class, args);
	}

}
