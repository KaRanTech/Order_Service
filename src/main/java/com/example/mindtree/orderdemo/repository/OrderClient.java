package com.example.mindtree.orderdemo.repository;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.mindtree.orderdemo.entity.ItemEntity;
import com.example.mindtree.orderdemo.entity.OrderEntity;
import com.example.mindtree.orderdemo.model.CreateItems;
import com.example.mindtree.orderdemo.model.CreateOrderModel;

/**
 * @author Karunakar Pilli.
 *
 */
@FeignClient(value = "order")
public interface OrderClient {

	/**
	 * @param model
	 * @return
	 */
	@PostMapping("/api/saveUpdate")
	CreateOrderModel saveUpdate(@RequestBody CreateOrderModel model);

	/**
	 * @param model
	 * @return
	 */
	@PostMapping("/api/item/saveUpdate")
	CreateItems saveUpdate(@RequestBody CreateItems model);

	/**
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public List<OrderEntity> findByOrdNum(@PathVariable(value = "id") Long id);

	/**
	 * @param id
	 * @return
	 */
	@GetMapping("/item/{id}")
	public ItemEntity findByItemNum(@PathVariable(value = "id") Long id);

}
