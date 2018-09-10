package com.hsit.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="service-hi",fallback=HiServiceImpl.class)
public interface HiService {

	@RequestMapping(value="/hi")
	String hi(@RequestParam(value="name") String name) ;
}

@Component
class HiServiceImpl implements HiService {

	@Override
	public String hi(String name) {
		// TODO Auto-generated method stub
		return "sorry "+name;
	}

}