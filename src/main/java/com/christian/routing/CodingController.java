package com.christian.routing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("")
	public String codingPage() {
		return "Hello Coding Dojo!";
	}
	
	@RequestMapping("/python")
	public String pythonPage() {
		return "Python/Django was awesome!";
	}
	
	@RequestMapping("/java")
	public String javaPage() {
		return "Java/Spring is better!";
	}
}

