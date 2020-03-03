package com.tex.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tex.model.Student;

@RestController
public class StudentRestController {
	@GetMapping("/show")
	public void show() {
		System.out.println("Hello  Void...!!!");
	}
	@GetMapping("/showA")
	public String showA() {
		return "Show   String";
	}
	@GetMapping("/showB")
	public Student showB() {
		return new Student(101,"AAA",500.5);
	}
	@GetMapping("/showC")
	public List<Student> showC(){
		List<Student> list=new ArrayList<>();
		list.add(new Student(102,"AA",3.3));
		list.add(new Student(103,"BB",4.3));
		list.add(new Student(104,"CC",5.3));
		list.add(new Student(105,"DD",6.3));
		
		return  list;
	}
	@GetMapping("/showD")
	public Map<String,Student> showD(){
		Map<String,Student> map=new HashMap<>();
		map.put("OB1", new Student(102,"AA",3.3));
		map.put("OB2", new Student(103,"BB",4.3));
		map.put("OB3", new Student(104,"CC",5.3));
		map.put("OB4", new Student(105,"DD",6.3));
		 
		return map;
	}
	@GetMapping("/showE")
	public ResponseEntity<String> showE(){
		
		return new ResponseEntity<String>(
				          "From RE", HttpStatus.OK);
		
	}
	
	
	
	
	
	
	
	

}
