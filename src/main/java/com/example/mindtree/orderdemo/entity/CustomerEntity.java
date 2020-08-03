package com.example.mindtree.orderdemo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Karunakar Pilli.
 *
 */
@Entity
@Table(name = "CUST_TBL")
public class CustomerEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "CUST_NUM")
	private Long custNum;

	@Column(name = "CUST_NAME")
	private String custName;

	@Column(name = "CUST_STREET")
	private String street;

	@Column(name = "CUST_CITY")
	private String city;

	@Column(name = "CUST_ZIP")
	private String zipCode;

	@Column(name = "CUST_PHNOE")
	private String phoneNumber;
	
	@ManyToOne
	@JoinColumn(name="ODR_NUM")
	private OrderEntity orderEntity;

	public OrderEntity getOrderEntity() {
		return orderEntity;
	}

	public void setOrderEntity(OrderEntity orderEntity) {
		this.orderEntity = orderEntity;
	}

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
		return "CustomerEntity [custNum=" + custNum + ", custName=" + custName + ", street=" + street + ", city=" + city
				+ ", zipCode=" + zipCode + ", phoneNumber=" + phoneNumber + ", orderEntity=" + orderEntity + "]";
	}

}
