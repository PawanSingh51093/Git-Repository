package com.tex.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tex.model.Address;
import com.tex.model.Employee;

@RestController
public class EmpRestController {
	
	@GetMapping("/formate")
	public Employee showJson() {
		ArrayList<String> list=new ArrayList<>();
		list.add("A");
		list.add("B");
		Map<String,String> map=new HashMap<>();
		map.put("D1", "DEV");
		map.put("D2", "MS");
		return new Employee(
				10,"AA",
				list,
				map,
				new Address("5-55","Hyd")
				);
	}

}
