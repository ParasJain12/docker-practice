package com.docker.test.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/")
	public Map<String, Object> getValues(){
		Map<String,Object> data = new HashMap<>();
		data.put("message", "Java is OOP language");
		data.put("languages", Arrays.asList("Java","Python","JS"));
		data.put("code", 123);
		return data;
	}
}
