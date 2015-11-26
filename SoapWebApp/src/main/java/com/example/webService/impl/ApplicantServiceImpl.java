/*
 * Steps to create simple WebService - Contract first or Top Down Approach
 * 
 * 1 - Create .wsdl file
 * 2 - Configure web service in sun-jaxws.xml
 * 3 - Configure web service as servlet and listener in web.xml
 * 4 - Configure POM.xml with maven dependcny and create wsimport profile to 
 * 	   generate java code logic from .wsdl.
 * 5 - Build maven project with goal:clean package and profiles:wsimport 
 * 6 - We expose the service here.
 */

package com.example.webService.impl;

import javax.jws.WebService;
import javax.xml.ws.BindingType;

import org.example.applicantservice.ApplicantException;
import org.example.applicantservice.ApplicantRequest;
import org.example.applicantservice.ApplicantResponse;
import org.example.applicantservice.ApplicantService;

import com.sun.xml.ws.developer.SchemaValidation;

@WebService(portName="applicantServiceSOAP",serviceName="applicantService",
		targetNamespace="http://www.example.org/applicantService/",wsdlLocation="WEB-INF/wsdl/ApplicantService.wsdl",
		endpointInterface="org.example.applicantservice.ApplicantService")
@BindingType("http://schemas.xmlsoap.org/wsdl/soap/http")
@SchemaValidation
public class ApplicantServiceImpl implements ApplicantService{

	@Override
	public ApplicantResponse getApplicant(ApplicantRequest applicantRequest)
			throws ApplicantException {
		final ApplicantResponse applicantResponse=new ApplicantResponse();
		applicantResponse.setApplicantCode("A103");
		applicantResponse.setApplicantName("Matt");
		applicantResponse.setApplicantMobile("8546856");
		applicantResponse.setApplicantAddress("Alamo");
		// Here will put our logic what the webservice do
		// for examaple to call database -> get some data -> perform the operations-> get back result
		return applicantResponse;
	}

}
