package com.et.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.et.entity.CropInformation;

@Service
public interface CropInformationService {
	
	
	public List<CropInformation> getCropInformation();

	public CropInformation insertCropInfo(CropInformation cropinfo);

}
