package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Details {
	
	
	@Id
	@GeneratedValue
	String pId;
	String pName;
	String pCategory;
	String pQuantity;
	
	
	public Details(String pName, String pCategory, String pQuantity) {
		super();
		this.pName = pName;
		this.pCategory = pCategory;
		this.pQuantity = pQuantity;
	}


//	public String getpId() {
//		return pId;
//	}
//
//
//	public void setpId(String pId) {
//		this.pId = pId;
//	}


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public String getpCategory() {
		return pCategory;
	}


	public void setpCategory(String pCategory) {
		this.pCategory = pCategory;
	}


	public String getpQuantity() {
		return pQuantity;
	}


	public void setpQuantity(String pQuantity) {
		this.pQuantity = pQuantity;
	}
	
	

	

}
