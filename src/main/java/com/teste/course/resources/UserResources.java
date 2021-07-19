package com.teste.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.course.entity.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	@GetMapping
	public ResponseEntity<User> findAll() {
		User user = new User(1L, "teste", "teste@", "9999999", "teste");
		return ResponseEntity.ok().body(user);
	}

}
