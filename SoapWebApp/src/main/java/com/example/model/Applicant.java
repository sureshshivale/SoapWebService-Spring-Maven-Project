package com.example.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;

@JsonTypeName("Applicant")
public class Applicant implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("ApplicantCode")
	private String applCde;
	@JsonProperty("ApplicantName")
	private String applNme;
	@JsonProperty("ApplicantAddress")
	private String applAddr;
	@JsonProperty("ApplicantMobile")
	private String applMble;
	
	public String getApplCde() {
		return applCde;
	}
	public void setApplCde(String applCde) {
		this.applCde = applCde;
	}
	public String getApplNme() {
		return applNme;
	}
	public void setApplNme(String applNme) {
		this.applNme = applNme;
	}
	public String getApplAddr() {
		return applAddr;
	}
	public void setApplAddr(String applAddr) {
		this.applAddr = applAddr;
	}
	public String getApplMble() {
		return applMble;
	}
	public void setApplMble(String applMble) {
		this.applMble = applMble;
	}
	
}
