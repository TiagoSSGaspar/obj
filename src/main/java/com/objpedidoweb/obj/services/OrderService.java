package com.objpedidoweb.obj.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.objpedidoweb.obj.entities.Order;
import com.objpedidoweb.obj.repositories.OrderRepository;


@Service
public class OrderService {

	@Autowired
	private OrderRepository OrderRepository;
	
	public List<Order> findAll() {
		return OrderRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = OrderRepository.findById(id);
		
		return obj.get();
	}
}
