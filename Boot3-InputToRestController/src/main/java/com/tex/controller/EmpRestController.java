package com.tex.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tex.model.Employee;

@RestController
public class EmpRestController {
	
	@GetMapping("/show")
	public ResponseEntity<String> readDataA(
			@RequestParam Integer eid,
			@RequestParam String ename
			)
	{
	   String body="ID = "+eid+",name= "+ename;
	   return new ResponseEntity<String>(
			   body,HttpStatus.OK
			   );
	}
	@GetMapping("/info")
	public ResponseEntity<String> readDataB(
			@RequestHeader String user,
			@RequestHeader String pwd
			){
		String body="user= "+user+" pwd="+pwd;
		return new ResponseEntity<String> (
				body,HttpStatus.OK
				);
	}
	@PostMapping("/data")
	public ResponseEntity<String> readDataC(
			@RequestBody Employee emp
			){
		return new ResponseEntity<String>(
				emp.toString(),HttpStatus.OK);
	}

}
