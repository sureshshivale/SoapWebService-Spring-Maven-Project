package com.example.webService.client;

import org.apache.commons.lang3.StringUtils;
import org.example.applicantservice.ApplicantException;
import org.example.applicantservice.ApplicantRequest;
import org.example.applicantservice.ApplicantResponse;
import org.example.applicantservice.ApplicantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.model.Applicant;

@Service
public class ApplicantServiceClientImpl implements ApplicantServiceClient{

	private static final Logger LOGGER =LoggerFactory.getLogger(ApplicantServiceClientImpl.class);
	
	@Override
	public Applicant searchApplicant(final String applicantCode) {
		 final ApplicantService applicantService = ApplicantServiceHandleProvider.getApplicantServiceHandle();
		 final ApplicantRequest applicantRequest=new ApplicantRequest();
		 applicantRequest.setApplicantCode(applicantCode);
		 ApplicantResponse applicantResponse=null;
		 try {
			applicantResponse = applicantService.getApplicant(applicantRequest);
		} catch (ApplicantException e) {
			LOGGER.error(e.getMessage());
		}
		final Applicant applicant=new Applicant();
		if(applicantResponse!=null){
			if(StringUtils.isNotBlank(applicantResponse.getApplicantCode())&& StringUtils.equals(applicantCode, applicantResponse.getApplicantCode())){
				applicant.setApplCde(applicantResponse.getApplicantCode());
				applicant.setApplNme(applicantResponse.getApplicantName());
				applicant.setApplMble(applicantResponse.getApplicantMobile());
				applicant.setApplAddr(applicantResponse.getApplicantAddress());
			}
		}
		return applicant;
	}

}
