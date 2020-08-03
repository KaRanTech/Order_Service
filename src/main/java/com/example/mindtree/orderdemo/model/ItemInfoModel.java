package com.example.mindtree.orderdemo.model;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Karunakar Pilli.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemInfoModel {

	private String productCode;

	private String productName;

	private String quntity;
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ItemInfoModel [productCode=" + productCode + ", productName=" + productName + ", quntity=" + quntity
				+ ", message=" + message + "]";
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getQuntity() {
		return quntity;
	}

	public void setQuntity(String quntity) {
		this.quntity = quntity;
	}

}
