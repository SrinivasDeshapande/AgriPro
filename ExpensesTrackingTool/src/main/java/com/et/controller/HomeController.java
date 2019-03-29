package com.et.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.et.entity.CropInformation;
import com.et.entity.FarmLandMapping;
import com.et.service.CropInformationService;
import com.et.service.FarmLandMappingService;

@CrossOrigin
@RestController
//@RequestMapping(value="/",method=RequestMethod.GET)
public class HomeController {
	//@RequestMapping(value="/",method=RequestMethod.GET)
	@GetMapping("home")
	public ResponseEntity<?> getWelcome(){
		System.out.println("Working ");
		return new ResponseEntity<>("Hello",HttpStatus.OK);
	}

}
