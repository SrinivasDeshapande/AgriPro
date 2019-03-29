package com.et.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.et.entity.BillingInformation;
import com.et.entity.CropInformation;
import com.et.service.BillingInformationService;

@CrossOrigin()
@RestController
public class BillController {

	@Autowired
	BillingInformationService billDao;
	
	@RequestMapping(value="/getAllBillsInfo",method=RequestMethod.GET)
	public ResponseEntity<?> getAllBillsInformation(){
		return new ResponseEntity<>(billDao.getAllBillsInformation(),HttpStatus.OK);
	}
	
	@RequestMapping(value="/getBillsInfoById",method=RequestMethod.POST)
	public ResponseEntity<?> getBillsInfoById(@RequestBody BillingInformation cropInfo){
		return new ResponseEntity<>(billDao.getBillsInfoById(cropInfo.getBillId()),HttpStatus.OK);
	} 
	
	@RequestMapping(value="/getBillsInfoByNo",method=RequestMethod.POST)
	public ResponseEntity<?> getBillsInfoByNo(@RequestBody BillingInformation cropInfo){
		return new ResponseEntity<>(billDao.getBillsInfoByNo(cropInfo.getBillNo()),HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/insertBillsInfo",method=RequestMethod.POST)
	public ResponseEntity<?> insertBillsInfo(@RequestBody BillingInformation cropinfo) {
		if(cropinfo != null && cropinfo instanceof BillingInformation)
		return new ResponseEntity<>(billDao.insertBillsInfo(cropinfo),HttpStatus.OK);
		else {
			return new ResponseEntity<>("Provide JSON body",HttpStatus.BAD_REQUEST);
		}
	}
}
