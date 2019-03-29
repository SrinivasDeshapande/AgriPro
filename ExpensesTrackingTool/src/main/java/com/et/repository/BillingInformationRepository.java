package com.et.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.et.entity.BillingInformation;
import com.et.entity.CropInformation;

@Repository
public interface BillingInformationRepository extends CrudRepository<BillingInformation, Long>{

	@Query(value=" from BillingInformation where Bill_id = ?1 ")
	public BillingInformation getBillerInfoById(long cropId);

	@Query(value=" from BillingInformation where billNo = ?1 ")
	public BillingInformation getBillerInfoByNo(long cropId);
}
