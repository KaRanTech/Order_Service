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
@Table(name = "PRODUCT_TBL")
public class ProductEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "PRDT_NUM")
	private Long prdtNum;
	
	@Column(name = "PRDT_NAME")
	private String prdtName;
	
	@Column(name = "PRDT_CODE")
	private String prdtCode;
	
	@Column(name = "PRDT_QUNTY")
	private String quantity;
	
	@ManyToOne
	@JoinColumn(name = "ITEM_NUM")
	private ItemEntity itemEntity;
	

	public ItemEntity getItemEntity() {
		return itemEntity;
	}

	public void setItemEntity(ItemEntity itemEntity) {
		this.itemEntity = itemEntity;
	}

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
		return "ProductEntity [prdtNum=" + prdtNum + ", prdtName=" + prdtName + ", prdtCode=" + prdtCode + ", quantity="
				+ quantity + ", itemEntity=" + itemEntity + "]";
	}

	
}
