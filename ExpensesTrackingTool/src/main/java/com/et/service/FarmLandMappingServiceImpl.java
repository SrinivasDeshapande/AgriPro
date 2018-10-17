package com.et.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.et.entity.FarmLandMapping;
import com.et.repository.FarmLandMappingRepository;


@Service
public class FarmLandMappingServiceImpl implements FarmLandMappingService{
	
	@Autowired
	public FarmLandMappingRepository farmLandRepos;

	@Override
	public List<FarmLandMapping> getFarmLandMapping() {
		// TODO Auto-generated method stub
		return (List<FarmLandMapping>) farmLandRepos.findAll();
	}

	@Override
	public FarmLandMapping insertFarmLandMapping(FarmLandMapping farmLandMap) {
		// TODO Auto-generated method stub
		return farmLandRepos.save(farmLandMap);
	}

	
}
