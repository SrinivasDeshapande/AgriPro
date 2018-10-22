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
	public List<CropInformation> getAllCropInformation() {
		// TODO Auto-generated method stub
		return (List<CropInformation>) cropRepos.findAll();
	}

	@Override
	public CropInformation insertCropInfo(CropInformation cropinfo) {
		// TODO Auto-generated method stub
		return cropRepos.save(cropinfo);
	}

	@Override
	public CropInformation getCropInfoById(long cropId) {
		// TODO Auto-generated method stub
		return cropRepos.getCropInfoById(cropId);
	}

}
