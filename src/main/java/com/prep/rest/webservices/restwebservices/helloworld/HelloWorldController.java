package com.prep.rest.webservices.restwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World Kittu";
	}
	
	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Kittu");
	}
	
	@GetMapping("/hello-world/path-variable/{name}") //suppose if we give name =kittu here kittu is path parameter, to capture path parameter we are using @PathVariable annotation
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean("Hello World" + name);
	}
	
	@GetMapping("/hello-world-new-bean")
	public HelloWorldBean helloWorldNewBean() {
		return new HelloWorldBean("Hello World Kittu Bathina");
	}

}
