package com.example.webService.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import org.example.applicantservice.ApplicantService;
import org.example.applicantservice.ApplicantService_Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.common.ApplicationContextProvider;

public class ApplicantServiceHandleProvider {

	private static final String LOCAL_PART = "LOCAL_PART";
	private static final String NAMESPACE_URI = "NAMESPACE_URI";
	private static final String APPLICANT_WSDL_URL = "APPLICANT_WSDL_URL";
	
	private static final Logger LOGGER =LoggerFactory.getLogger(ApplicantServiceHandleProvider.class);
	
	public static ApplicantService getApplicantServiceHandle(){
		ApplicantService applicantService=null;
		try {
			final String url = ApplicationContextProvider.getApplicantWsdlProps().getProperty(APPLICANT_WSDL_URL);
			final String NamespaceUri = ApplicationContextProvider.getApplicantWsdlProps().getProperty(NAMESPACE_URI);
			final String localPart = ApplicationContextProvider.getApplicantWsdlProps().getProperty(LOCAL_PART);
			final URL wsdlUrl = new URL(url);
			final QName qName=new QName(NamespaceUri, localPart);
			final ApplicantService_Service applicantService_Service=new ApplicantService_Service(wsdlUrl,qName);
			applicantService = applicantService_Service.getApplicantServiceSOAP();
		} catch (MalformedURLException e) {
			LOGGER.error(e.getMessage());
		}
		return applicantService;
	}
}
