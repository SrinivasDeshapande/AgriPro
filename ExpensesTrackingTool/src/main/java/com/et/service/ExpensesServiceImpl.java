package com.et.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.et.entity.ExpenseTypes;
import com.et.entity.Expenses;
import com.et.repository.ExpensesRepository;
import com.et.repository.ExpensesTypeRepository;

@Service
public class ExpensesServiceImpl implements ExpensesService{
	
	@Autowired
	public ExpensesRepository expenseRepos;
	
	@Autowired
	public ExpensesTypeRepository expenseTypeRepos;


	@Override
	public List<Expenses> getAllExpenses() {
		// TODO Auto-generated method stub
		return (List<Expenses>) expenseRepos.findAll();
	}

	@Override
	public Expenses getExpensesById(Long cropId) {
		// TODO Auto-generated method stub
		return expenseRepos.getExpensesById(cropId);
	}

	@Override
	public Expenses insertExpenses(Expenses expense) {
		// TODO Auto-generated method stub
		return expenseRepos.saveAndFlush(expense);
		
	}

	@Override
	public List<ExpenseTypes> getAllExpensesType() {
		// TODO Auto-generated method stub
		return expenseTypeRepos.findAll();
	}

	@Override
	public ExpenseTypes getExpensesTypeById(Long exptype) {
		// TODO Auto-generated method stub
		return expenseTypeRepos.getExpensesById(exptype);
	}

	
	
}
