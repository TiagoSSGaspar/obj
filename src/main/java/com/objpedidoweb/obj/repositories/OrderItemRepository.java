package com.objpedidoweb.obj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.objpedidoweb.obj.entities.OrderItem;



public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
