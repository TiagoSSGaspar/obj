package com.objpedidoweb.obj.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.objpedidoweb.obj.entities.Order;
import com.objpedidoweb.obj.services.OrderService;

@RestController
@RequestMapping(value = "/order")
public class OrderResources {

	@Autowired
	private OrderService userService;

	@GetMapping
	public ResponseEntity<List<Order>> findAll() {

		List<Order> list = userService.findAll();

		return ResponseEntity.ok().body(list);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {

		Order obj = userService.findById(id);

		return ResponseEntity.ok().body(obj);
	}

}
