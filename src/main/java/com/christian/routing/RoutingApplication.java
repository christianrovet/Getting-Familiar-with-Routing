package com.christian.routing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RoutingApplication {
	
	@RequestMapping("/")
	public String world() {
		return "Welcome to the Getting Familiar with Routing Assignment - Christian Rovet :)";
	}

	public static void main(String[] args) {
		SpringApplication.run(RoutingApplication.class, args);
		
	}

}