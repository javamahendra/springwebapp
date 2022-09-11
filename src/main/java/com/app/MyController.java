package com.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping(value = "/hello")
	public String hello(@RequestParam(name = "name", defaultValue = "Mahi", required = false) String name) {
		System.out.println("Hello...");
		return "Hello Jenkins CI SpringMVCFormApp Executing... ::"+name;
	}

}