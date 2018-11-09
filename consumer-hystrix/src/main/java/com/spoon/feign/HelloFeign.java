package com.spoon.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//Feign的接口
@FeignClient("provider-user")//找到提供者，通过Eureka
public interface HelloFeign {
	// 对提供者调用
	// 调用服务提供者
	@RequestMapping("/hello/{name}")
	public String welcome(@PathVariable("name") String name);
}
