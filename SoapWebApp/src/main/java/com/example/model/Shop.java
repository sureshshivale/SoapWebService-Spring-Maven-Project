package com.example.model;

import java.io.Serializable;


public class Shop implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String shopName;
	private String shopLocation[];
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String[] getShopLocation() {
		return shopLocation;
	}
	public void setShopLocation(String[] shopLocation) {
		this.shopLocation = shopLocation;
	}
}
