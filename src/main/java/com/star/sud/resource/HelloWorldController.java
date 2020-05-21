package com.star.sud.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	private String getMessage() {
		return "Hello world";
	}

	@GetMapping("/hello/{name}")
	public HelloWorld helloWorld(@PathVariable String name) {
		return new HelloWorld(String.format("Welcome to %s", name));
	}
}
