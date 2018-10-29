package com.et.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.et.entity.BillingInformation;
import com.et.entity.CropInformation;

@Repository
public interface BillingInformationRepository extends CrudRepository<BillingInformation, Long>{

	@Query(value=" from BillingInformation where Bill_id = ?1 ")
	public CropInformation getBillerInfoById(long cropId);
}
