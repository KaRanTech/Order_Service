package com.example.mindtree.orderdemo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Karunakar Pilli.
 *
 */
@Entity
@Table(name = "ORDER_TBL")
public class OrderEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ORD_NUM")
	private Long ordNum;

	@Column(name = "ORD_DATE")
	private Date ordDate;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "ORD_NUM")
	private CustomerEntity custNum;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "ITEM_NUM")
	private ItemEntity items;

	@Column(name = "ORD_TOTAL")
	private String total;

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

	public CustomerEntity getCustNum() {
		return custNum;
	}

	public void setCustNum(CustomerEntity custNum) {
		this.custNum = custNum;
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
		return "OrderEntity [ordNum=" + ordNum + ", ordDate=" + ordDate + ", custNum=" + custNum + ", items=" + items
				+ ", total=" + total + "]";
	}

}
