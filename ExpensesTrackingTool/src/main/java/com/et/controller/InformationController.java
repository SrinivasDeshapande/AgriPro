package com.et.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.et.entity.CropInformation;
import com.et.service.CropInformationService;

@CrossOrigin(origins= {"http://localhost:7880/"})@RestController
@RequestMapping("/Crop")
public class InformationController {
	
	@Autowired
	CropInformationService cropDao;

	@RequestMapping(value="/getAllCropInfo",method=RequestMethod.GET)
	public ResponseEntity<?> getAllCropInformation(){
		return new ResponseEntity<>(cropDao.getAllCropInformation(),HttpStatus.OK);
	}
	
	@RequestMapping(value="/getCropInfoById",method=RequestMethod.POST)
	public ResponseEntity<?> getCropInfoById(@RequestBody CropInformation cropInfo){
		return new ResponseEntity<>(cropDao.getCropInfoById(cropInfo.getCropId()),HttpStatus.OK);
	}
	
	@RequestMapping(value="/insertCropInfo",method=RequestMethod.POST)
	public ResponseEntity<?> insertCropsInfo(@RequestBody CropInformation cropinfo) {
		if(cropinfo != null && cropinfo instanceof CropInformation)
		return new ResponseEntity<>(cropDao.insertCropInfo(cropinfo),HttpStatus.OK);
		else {
			return new ResponseEntity<>("Provide JSON body",HttpStatus.BAD_REQUEST);
		}
	}
}
