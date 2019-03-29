package com.et.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.et.entity.BillingInformation;

@Service
public interface BillingInformationService {


	public List<BillingInformation> getAllBillsInformation();

	public BillingInformation insertBillsInfo(BillingInformation cropinfo);

	public BillingInformation getBillsInfoById(long cropId);

	public BillingInformation getBillsInfoByNo(Long billNo);
}
