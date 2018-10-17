package com.et.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.et.entity.CropInformation;
import com.et.entity.FarmLandMapping;
import com.et.service.CropInformationService;
import com.et.service.FarmLandMappingService;

@RestController
//@RequestMapping(value="/",method=RequestMethod.GET)
@RequestMapping("/")
public class HomeController {
	//@RequestMapping(value="/",method=RequestMethod.GET)
	@Autowired
	CropInformationService cropDao;

	@Autowired
	FarmLandMappingService farmLandDao;
	
	@GetMapping("home")
	public ResponseEntity<?> getWelcome(){
		System.out.println("Working ");
		return new ResponseEntity<>("Hello",HttpStatus.OK);
	}

	@GetMapping("CropInformaiton")
	public ResponseEntity<?> getCropInformation(){
		return new ResponseEntity<>(cropDao.getCropInformation(),HttpStatus.OK);
	}
	
	@RequestMapping(value="insertCropInfo",method=RequestMethod.POST)
	public ResponseEntity<?> insertCropsInfo(@RequestBody CropInformation cropinfo) {
		return new ResponseEntity<>(cropDao.insertCropInfo(cropinfo),HttpStatus.OK);
	}
	@RequestMapping(value="insertFarmLandMapping",method=RequestMethod.POST)
	public ResponseEntity<?> insertFarmLandMap(@RequestBody FarmLandMapping farmLandMap) {
		System.out.println(farmLandMap.toString());
		
		System.out.println("UpdatorID"+farmLandMap.getUpdator_id());
		return new ResponseEntity<>(farmLandDao.insertFarmLandMapping(farmLandMap),HttpStatus.OK);
	}

}
