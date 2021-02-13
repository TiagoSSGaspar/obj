package com.objpedidoweb.obj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.objpedidoweb.obj.entities.User;



public interface UserRepository extends JpaRepository<User, Long> {

}
