package com.example.mindtree.orderdemo.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ObjectUtils;

import com.example.mindtree.orderdemo.exception.OrderCustomException;
import com.example.mindtree.orderdemo.model.CreateOrderModel;

/**
 * @author Karunakar Pilli.
 *
 */
public class OrderValidation {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrderValidation.class);

	private OrderValidation() {
	}

	/**
	 * @param data
	 * @param filedName
	 * @throws OrderCustomException
	 */
	private static void validateField(Object data, String filedName) throws OrderCustomException {
		if (ObjectUtils.isEmpty(data)) {
			throw new OrderCustomException(filedName);
		}
	}

	/**
	 * @param model
	 * @throws OrderCustomException
	 */
	public static void orderValidation(CreateOrderModel model) throws OrderCustomException {
		LOGGER.error("Validating cMDataRequest start: {} ", model);
		validateField(model, "Empty request");
		validateField(model.getCustomerEntity(), "Please enter Valid Customer info");
		validateField(model.getItemEntity(), "Please enter Valid Item info");
		validateField(model.getTotal(), "Please enter Valid data");
		validateField(model.getOrdDate(), "Please enter validate Date");
		LOGGER.error("Validation successful for Orderdata request received : {} ", model);
	}

}
