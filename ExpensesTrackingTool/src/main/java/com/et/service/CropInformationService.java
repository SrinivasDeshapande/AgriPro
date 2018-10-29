package com.et.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.et.entity.CropInformation;

@Service
public interface CropInformationService {
	
	
	public List<CropInformation> getAllCropInformation();

	public CropInformation insertCropInfo(CropInformation cropinfo);

	public CropInformation getCropInfoById(long cropId);

}