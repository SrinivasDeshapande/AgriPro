package com.et.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.et.entity.ExpenseTypes;
import com.et.entity.Expenses;
import com.et.service.ExpensesService;

@CrossOrigin
@RestController
@RequestMapping("/Expense")
public class ExpensesController {
	
	@Autowired
	ExpensesService expenseDao;
	
	

	@RequestMapping(value="/getAllExpenses",method=RequestMethod.GET)
	public ResponseEntity<?> getAllExpenses(){
		return new ResponseEntity<>(expenseDao.getAllExpenses(),HttpStatus.OK);
	}
	
	@RequestMapping(value="/getExpensesById",method=RequestMethod.POST)
	public ResponseEntity<?> getExpensesById(@RequestBody Expenses cropInfo){
		return new ResponseEntity<>(expenseDao.getExpensesById(cropInfo.getCropId()),HttpStatus.OK);
	}
	
	@RequestMapping(value="/insertExpenses",method=RequestMethod.POST)
	public ResponseEntity<?> insertExpenses(@RequestBody Expenses cropinfo) {
		if(cropinfo != null && cropinfo instanceof Expenses)
		return new ResponseEntity<>(expenseDao.insertExpenses(cropinfo),HttpStatus.OK);
		else {
			return new ResponseEntity<>("Provide JSON body",HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="/getAllExpensesType",method=RequestMethod.GET)
	public ResponseEntity<?> getAllExpensesType() {
		
		return new ResponseEntity<>(expenseDao.getAllExpensesType(),HttpStatus.OK);
		
	}
	@RequestMapping(value="/getExpensesTypeById",method=RequestMethod.GET)
	public ResponseEntity<?> getExpensesTypeById(@RequestBody ExpenseTypes expType) {
		
		return new ResponseEntity<>(expenseDao.getExpensesTypeById(expType.getTypeId()),HttpStatus.OK);
		
	}
}
