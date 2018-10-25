package com.et.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.et.entity.FarmLandMapping;

@Repository
public interface FarmLandMappingRepository extends CrudRepository<FarmLandMapping, Long> {

	
}
