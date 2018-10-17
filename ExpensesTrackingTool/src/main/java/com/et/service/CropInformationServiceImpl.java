package com.et.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.et.entity.CropInformation;
import com.et.repository.CropInformationRepository;

@Service
public class CropInformationServiceImpl implements CropInformationService{
	
	@Autowired
	public CropInformationRepository cropRepos;

	@Override
	public List<CropInformation> getCropInformation() {
		// TODO Auto-generated method stub
		return cropRepos.findAll();
	}

}
