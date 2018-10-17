package com.et.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.et.entity.FarmLandMapping;
import com.et.entity.InvestorInformation;

@Repository
public interface FarmLandMappingRepository extends JpaRepository<FarmLandMapping, Long>{

	
}
