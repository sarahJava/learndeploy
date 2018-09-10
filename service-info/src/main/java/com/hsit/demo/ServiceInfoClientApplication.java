package com.hsit.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ServiceInfoClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceInfoClientApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/hi")
	public String hi() {
		return restTemplate.getForObject("http://localhost:8772/miya", String.class);
	}
	
	@RequestMapping("/info")
	public String info() {
		return "hi,i am from service-info";
		
	}
}
