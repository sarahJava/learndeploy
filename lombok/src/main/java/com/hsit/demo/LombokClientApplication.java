package com.hsit.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LombokClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokClientApplication.class, args);
	}

}
