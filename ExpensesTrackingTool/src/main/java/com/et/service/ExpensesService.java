package com.et.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.et.entity.ExpenseTypes;
import com.et.entity.Expenses;

@Service
public interface ExpensesService {

	public List<Expenses> getAllExpenses();

	public Expenses getExpensesById(Long cropId);

	public Expenses insertExpenses(Expenses cropinfo);

	public List<ExpenseTypes> getAllExpensesType();


}
