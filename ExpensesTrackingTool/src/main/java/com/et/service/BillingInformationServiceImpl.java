package com.et.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.et.entity.BillingInformation;
import com.et.repository.BillingInformationRepository;


@Service
public class BillingInformationServiceImpl implements BillingInformationService {

	@Autowired
	public BillingInformationRepository billRepos;

	@Override
	public List<BillingInformation> getAllBillsInformation() {
		// TODO Auto-generated method stub
		return (List<BillingInformation>) billRepos.findAll();
	}

	@Override
	public BillingInformation insertBillsInfo(BillingInformation cropinfo) {
		// TODO Auto-generated method stub
		return billRepos.save(cropinfo);
	}

	@Override
	public BillingInformation getBillsInfoById(long cropId) {
		// TODO Auto-generated method stub
		return billRepos.getBillerInfoById(cropId);
	}

	@Override
	public BillingInformation getBillsInfoByNo(Long billNo) {
		// TODO Auto-generated method stub
		return billRepos.getBillerInfoByNo(billNo);
	}

}
