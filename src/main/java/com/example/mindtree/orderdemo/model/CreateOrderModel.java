package com.example.mindtree.orderdemo.model;

import java.util.Date;

import com.example.mindtree.orderdemo.entity.CustomerEntity;
import com.example.mindtree.orderdemo.entity.ItemEntity;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Karunakar Pilli.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateOrderModel {

	private Long ordNum;

	private Date ordDate;

	private CustomerEntity customerEntity;

	private ItemEntity itemEntity;

	private String total;
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getOrdNum() {
		return ordNum;
	}

	public void setOrdNum(Long ordNum) {
		this.ordNum = ordNum;
	}

	public Date getOrdDate() {
		return ordDate;
	}

	public void setOrdDate(Date ordDate) {
		this.ordDate = ordDate;
	}

	public CustomerEntity getCustomerEntity() {
		return customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}

	public ItemEntity getItemEntity() {
		return itemEntity;
	}

	public void setItemEntity(ItemEntity itemEntity) {
		this.itemEntity = itemEntity;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "CreateOrderModel [ordNum=" + ordNum + ", ordDate=" + ordDate + ", customerEntity=" + customerEntity
				+ ", itemEntity=" + itemEntity + ", total=" + total + ", message=" + message + "]";
	}

}
