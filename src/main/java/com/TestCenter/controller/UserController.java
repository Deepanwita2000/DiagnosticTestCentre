package com.TestCenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.DiagnosticTest.service.UserService;
import com.TestCenter.Entity.User;
import com.TestCenter.service.UserService;

@RestController
public class UserController//new
{

	@Autowired
	UserService user_service;
	
	@PostMapping("/addUser")
	public ResponseEntity<User> addUser(@RequestBody   User user  ) {
		
		return new ResponseEntity<>(user_service.addUser(user), HttpStatus.CREATED);
	}
	
	@GetMapping("/getUser")
    public List<User> getAllUser() {
	 	return user_service.fetchAllUser();
       
    }
	
	  @GetMapping("/getUser/{id}") 
	  public User getUserById(@PathVariable("user_id")int user_id)
	  {
		  return user_service.getUserById(user_id);
	  }
	  
	  
	  @PutMapping("/user/{id}")
	    public User updateUser(@PathVariable("user_id") int user_id, @RequestBody User user) {
		
	      return user_service.upadteUserById(user_id, user) ; 
	    }
	  
	  @DeleteMapping("/user/{id}")
	  public String deleteUser(@PathVariable("user_id") int user_id) {
		
		 return user_service.deleteUserById(user_id);
	  }
}
