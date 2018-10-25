package com.et.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.et.entity.Expenses;

@Repository
public interface ExpensesRepository extends JpaRepository<Expenses, Long>{

	@Query(value=" from Expenses where Exp_id = ?1 ")
	public Expenses getExpensesById(Long cropId);

	
}
