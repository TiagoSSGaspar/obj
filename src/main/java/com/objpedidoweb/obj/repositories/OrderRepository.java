package com.objpedidoweb.obj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.objpedidoweb.obj.entities.Order;



public interface OrderRepository extends JpaRepository<Order, Long> {

}
