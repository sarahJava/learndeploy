package com.hsit.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Service
public class HelloService {

	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="hiError")
	public String hiService(String name) {
		return restTemplate.getForObject("http://service-hi/hi?name="+name, String.class);
	}
	
	//参数和返回值与原方法一致
	public String hiError(String name) {
		return "hi "+name+",sorry,error";
		
	}
}
