package com.objpedidoweb.obj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.objpedidoweb.obj.entities.Category;



public interface CategoryRepository extends JpaRepository<Category, Long> {

}
