package com.demo.spring.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class DemoRestController {
	
	@GetMapping(value="/greet")
	public  ResponseEntity <String> doGreet(){
		return ResponseEntity.ok("{\"status\":\"Welcome.\"}");
	}

}
