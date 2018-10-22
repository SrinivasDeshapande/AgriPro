package com.et.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.et.entity.CropInformation;

@Repository
public interface CropInformationRepository extends CrudRepository<CropInformation, Long>{

	@Query(value=" from CropInformation where cropId = ?1 ")
	public CropInformation getCropInfoById(long cropId);
}
