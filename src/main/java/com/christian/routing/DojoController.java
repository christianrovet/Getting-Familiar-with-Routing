package com.christian.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{input}")
	public String showLocation(@PathVariable("input") String input) {
		if(input.equals("dojo")) {
			return "The dojo is awesome!";
		} else if (input.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California";
		} else if(input.equals("san-jose")) {
			return "SJ Dojo is the headquarters";
		} else {
			return input;
		}
	}
}