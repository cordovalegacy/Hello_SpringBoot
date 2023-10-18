package com.example.hello_world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class HelloWorldApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@RequestMapping("/")
	public String index() {
		return "Hello World";
	}
	@RequestMapping("/newRoute")
	public String newRoute() {
		return "Hello Spring Boot";
	}

}
