package com.example.mindtree.orderdemo.model;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Karunakar Pilli.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerModel {

	private Long custNum;

	private String custName;

	private String street;

	private String city;

	private String zipCode;

	private String phoneNumber;

	public Long getCustNum() {
		return custNum;
	}

	public void setCustNum(Long custNum) {
		this.custNum = custNum;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "CustomerModel [custNum=" + custNum + ", custName=" + custName + ", street=" + street + ", city=" + city
				+ ", zipCode=" + zipCode + ", phoneNumber=" + phoneNumber + "]";
	}

}
