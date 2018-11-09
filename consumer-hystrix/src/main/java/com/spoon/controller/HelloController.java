package com.spoon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.spoon.feign.HelloFeign;
@RestController
public class HelloController {
	//注入接口
	@Autowired
	private HelloFeign helloFeign;
	@RequestMapping("/hello/{name}")//配置断路器
	@HystrixCommand(fallbackMethod="fallbackMethod")
	public String welcome(@PathVariable String name){
		//调用提供者
		return helloFeign.welcome(name);
	}
	//hystrix不够完美，第一次可能会进到断路器:如果业务顺畅执行，就会正常
	public String fallbackMethod(String name){
		return "jack";
	}
}
