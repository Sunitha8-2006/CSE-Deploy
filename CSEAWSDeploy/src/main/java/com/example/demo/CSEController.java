package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CSEController {
	@GetMapping("/home")
	public String rocks() {
		return "Developed By 23MH1A05P9";
	}
	
	@GetMapping("/cse")
	public String rocks1() {
		return "Welcome to Third year cse";
	}
}
