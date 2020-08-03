package com.example.mindtree.orderdemo.model;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Karunakar Pilli.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductModel {

	private Long prdtNum;

	private String prdtName;

	private String prdtCode;

	private String quantity;

	public Long getPrdtNum() {
		return prdtNum;
	}

	public void setPrdtNum(Long prdtNum) {
		this.prdtNum = prdtNum;
	}

	public String getPrdtName() {
		return prdtName;
	}

	public void setPrdtName(String prdtName) {
		this.prdtName = prdtName;
	}

	public String getPrdtCode() {
		return prdtCode;
	}

	public void setPrdtCode(String prdtCode) {
		this.prdtCode = prdtCode;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ProductModel [prdtNum=" + prdtNum + ", prdtName=" + prdtName + ", prdtCode=" + prdtCode + ", quantity="
				+ quantity + "]";
	}

}
