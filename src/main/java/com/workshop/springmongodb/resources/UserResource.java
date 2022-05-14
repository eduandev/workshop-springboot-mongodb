package com.workshop.springmongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshop.springmongodb.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		
		User maria = new User("1", "Maria Brow", "maria@gmail.com");
		User alex = new User("2", "Alex Grey", "alex@gmail.com");
		User bob = new User("3", "Bob Matt", "bob@gmail.com");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria,alex,bob));
		
		return ResponseEntity.ok().body(list);
	}

}
