package com.coursejpa.course.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coursejpa.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
		
		@GetMapping
		public ResponseEntity<User> findAll() {
			User u = new User(1L, "Maria", "maria@gmail.com", "78485792", "124531");
			return ResponseEntity.ok().body(u);
		}
	
	

}
