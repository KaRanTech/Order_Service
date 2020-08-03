package com.example.mindtree.orderdemo.utils;

import com.example.mindtree.orderdemo.entity.CustomerEntity;
import com.example.mindtree.orderdemo.entity.ItemEntity;
import com.example.mindtree.orderdemo.entity.ProductEntity;
import com.example.mindtree.orderdemo.model.CreateOrderModel;

/**
 * @author Karunakar Pilli.
 *
 */
public class OrderUtils {

	/**
	 * @param model
	 * @return
	 */
	public CreateOrderModel getOrderInfo(CreateOrderModel model) {

		CreateOrderModel order = new CreateOrderModel();
		order.setOrdDate(model.getOrdDate());
		order.setTotal(model.getTotal());
		order.setCustomerEntity(getCust(model.getCustomerEntity()));
		order.setItemEntity(getItem(model.getItemEntity()));
		return order;
	}

	/**
	 * @param entity
	 * @return
	 */
	public CustomerEntity getCust(CustomerEntity entity) {
		CustomerEntity cust = new CustomerEntity();
		cust.setCustName(entity.getCustName());
		cust.setPhoneNumber(entity.getPhoneNumber());
		cust.setCity(entity.getCity());
		cust.setStreet(entity.getStreet());
		cust.setZipCode(entity.getZipCode());
		return cust;
	}

	/**
	 * @param entity
	 * @return
	 */
	public ProductEntity getProduct(ProductEntity entity) {
		ProductEntity product = new ProductEntity();
		product.setPrdtCode(entity.getPrdtCode());
		product.setPrdtName(entity.getPrdtName());
		product.setQuantity(entity.getQuantity());
		return product;
	}

	/**
	 * @param entity
	 * @return
	 */
	public ItemEntity getItem(ItemEntity entity) {
		ItemEntity item = new ItemEntity();
		item.setProductEntity(getProduct(entity.getProductEntity()));
		return item;
	}
}
