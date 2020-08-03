package com.example.mindtree.orderdemo.model;

import com.example.mindtree.orderdemo.entity.ItemEntity;
import com.example.mindtree.orderdemo.entity.ProductEntity;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Karunakar Pilli.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateItems {

	private ItemEntity item;

	private ProductEntity product;

	public ItemEntity getItem() {
		return item;
	}

	public void setItem(ItemEntity item) {
		this.item = item;
	}

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "CreateItems [item=" + item + ", product=" + product + "]";
	}

}
