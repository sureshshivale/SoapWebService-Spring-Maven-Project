package com.example.webService.client;

import com.example.model.Applicant;

public interface ApplicantServiceClient {

	public Applicant searchApplicant(final String applicantCode);
}