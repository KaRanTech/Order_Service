package com.example.mindtree.orderdemo.model;

import java.util.Date;

import com.example.mindtree.orderdemo.entity.ItemEntity;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Karunakar Pilli.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderInfoModel {

	private String customerName;

	private String shippingAddress;

	private Date orderDate;

	private ItemEntity items;

	private String total;
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public ItemEntity getItems() {
		return items;
	}

	public void setItems(ItemEntity items) {
		this.items = items;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "OrderInfoModel [customerName=" + customerName + ", shippingAddress=" + shippingAddress + ", orderDate="
				+ orderDate + ", items=" + items + ", total=" + total + ", message=" + message + "]";
	}

}
