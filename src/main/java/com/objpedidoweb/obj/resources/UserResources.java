package com.objpedidoweb.obj.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.objpedidoweb.obj.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResources {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Tiago", "ok@gmail", "99779977", "1234");
		
		return ResponseEntity.ok(u);
		
	}

}
