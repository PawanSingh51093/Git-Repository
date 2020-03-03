package com.example.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {
	
	@GetMapping("/show")
	public String show() {
		/*
		 * if(5>3) throw new RuntimeException("Sample Code...");
		 */
		return "Hello Rest....";
	}
	@PostMapping("/showA")
	public String showA() {
		return "Welcome   POST";
	}
    @PutMapping("/showB")
	public String showB() {
		return "Welcome   PUT";
	}
    @DeleteMapping("/showC")
	public String showC() {
		return "Welcome   DELETE";
	}
}
