package com.example.mindtree.orderdemo.controller;

import java.util.List;

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
import com.example.mindtree.orderdemo.model.CreateItems;
import com.example.mindtree.orderdemo.model.ItemInfoModel;
import com.example.mindtree.orderdemo.repository.OrderClient;

/**
 * @author Karunakar Pilli.
 *
 */
@RestController
@RequestMapping("/api")
public class ItemController {
	
	private static Logger logger = LoggerFactory.getLogger(ItemController.class);

	@Autowired
	private OrderClient client;
	
	/**
	 * @param model
	 * @return
	 */
	@PostMapping("/saveUpdate")
	public CreateItems saveUpdate(@RequestBody CreateItems model) {
		return client.saveUpdate(model);
	}

	/**
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public ItemInfoModel getOrderId(@PathVariable(value = "id") Long id) {
		ItemInfoModel model = new ItemInfoModel();
		try {
			List<ItemEntity> entity = (List<ItemEntity>) client.findByItemNum(id);
			for (ItemEntity itemEntity : entity) {
				model.setProductCode(itemEntity.getProductEntity().getPrdtCode());
				model.setProductName(itemEntity.getProductEntity().getPrdtName());
				model.setQuntity(itemEntity.getProductEntity().getQuantity());
				model.setMessage("Success");
			}
		} catch (Exception e) {
			model.setMessage("Please enter Valid ItemId");
			logger.error("Please enter valid Item Id");
		}
		return model;
	}

}
