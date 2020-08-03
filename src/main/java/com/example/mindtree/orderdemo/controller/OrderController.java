package com.example.mindtree.orderdemo.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mindtree.orderdemo.entity.ItemEntity;
import com.example.mindtree.orderdemo.entity.OrderEntity;
import com.example.mindtree.orderdemo.exception.OrderCustomException;
import com.example.mindtree.orderdemo.model.CreateOrderModel;
import com.example.mindtree.orderdemo.model.OrderInfoModel;
import com.example.mindtree.orderdemo.repository.OrderClient;
import com.example.mindtree.orderdemo.utils.OrderUtils;
import com.example.mindtree.orderdemo.utils.OrderValidation;

/**
 * @author Karunakar Pilli.
 *
 */
@RestController
@RequestMapping("/api")
public class OrderController {

	private static Logger logger = LoggerFactory.getLogger(OrderController.class);

	@Autowired
	private OrderClient client;
	
	@Autowired
	private OrderUtils utils;

	/**
	 * @param model
	 * @return
	 * @throws OrderCustomException 
	 */
	@PostMapping("/saveUpdate")
	public CreateOrderModel saveUpdate(@RequestBody CreateOrderModel model) throws OrderCustomException {
		OrderValidation.orderValidation(model);
		CreateOrderModel persist = utils.getOrderInfo(model);
		persist.setMessage("Order Created");
		return client.saveUpdate(persist);
	}

	/**
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public OrderInfoModel getOrderId(@PathVariable(value = "id") Long id) {
		OrderInfoModel model = new OrderInfoModel();
		try {
			List<OrderEntity> entity = client.findByOrdNum(id);
			Optional<OrderEntity> eny = entity.stream().filter(find -> find.equals(id)).findFirst();
			if (eny.isPresent()) {
				model.setCustomerName(eny.get().getCustNum().getCustName());
				model.setOrderDate(eny.get().getOrdDate());
				model.setShippingAddress(eny.get().getCustNum().toString());
				model.setItems(eny.get().getItems());
				model.setTotal(eny.get().getTotal());
				model.setMessage("Success");
			}
		} catch (Exception e) {
			logger.error("Please enter valid Order Id");
			model.setMessage("Please enter valid order Id");
		}
		return model;
	}
}
