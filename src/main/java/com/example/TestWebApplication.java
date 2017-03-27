package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestWebApplication.class, args);
	}
	
	@RequestMapping("/")
	public String test() {
		return "hello";
	}
}
