package com.objpedidoweb.obj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.objpedidoweb.obj.entities.Product;



public interface ProductRepository extends JpaRepository<Product, Long> {

}
