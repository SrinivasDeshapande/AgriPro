package com.et.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.et.entity.FarmLandMapping;


@Service
public interface FarmLandMappingService {
	
	
	public List<FarmLandMapping> getFarmLandMapping();

	public FarmLandMapping insertFarmLandMapping(FarmLandMapping cropinfo);

}
