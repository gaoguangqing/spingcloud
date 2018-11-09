package com.spoon.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello/{name}")
	public String wel(@PathVariable String name) {
		return "你好，欢迎 "+name;
	}
}
