package com.et.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value="/",method=RequestMethod.GET)
@RequestMapping("/")
public class HomeController {
	//@RequestMapping(value="/",method=RequestMethod.GET)
	@GetMapping("home")
	public ResponseEntity getWelcome(){
		System.out.println("Working ");
		return new ResponseEntity("Hello",HttpStatus.OK);
	}

}
