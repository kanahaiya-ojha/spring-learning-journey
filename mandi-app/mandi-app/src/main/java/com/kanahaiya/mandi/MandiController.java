package com.kanahaiya.mandi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //--> this class will handle web requests
public class MandiController {
   
	@GetMapping("/hello")
	public String sayHello() {// Maps this method to http://localhost:8080/hello
		return "welcome to the Mandi App - Powered by Spring Boot!";
	}
}
