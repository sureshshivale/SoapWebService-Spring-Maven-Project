package com.example.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Location")
@XmlType(propOrder={"locationName","branches","areaCode"})
public class Location implements Serializable {

	private static final long serialVersionUID = 1L;

	private String locationName;
	private String areaCode;
	private String[] branches;
	private String locationId;
	
	@XmlElement(name="LocationName")
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	@XmlElement
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	@XmlElement
	public String[] getBranches() {
		return branches;
	}
	public void setBranches(String[] branches) {
		this.branches = branches;
	}
	@XmlAttribute(name="Id")
	public String getLocationId() {
		return locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
}
