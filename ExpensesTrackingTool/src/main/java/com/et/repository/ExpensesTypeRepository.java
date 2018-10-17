package com.et.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.et.entity.ExpenseTypes;

@Repository
public interface ExpensesTypeRepository extends JpaRepository<ExpenseTypes, Long>{

	
}
