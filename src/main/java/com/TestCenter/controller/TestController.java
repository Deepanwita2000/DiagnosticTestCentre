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

import com.TestCenter.Entity.Test;
import com.TestCenter.service.TestService;

@RestController
public class TestController {

	@Autowired
	TestService test_service;
	
	@PostMapping("/addtestname")
	public ResponseEntity<Test> addtestname(@RequestBody  Test test  ) {
		return new ResponseEntity<> (test_service.addtestname(test),HttpStatus.CREATED);
	}
	
	@GetMapping("/gettestname")
	 public List<Test> getAlltest() {
		 	
	       return test_service.fetchAllTest();
	    }
	
	@GetMapping("/gettestname/{id}")
	 public Test gettestnameById(@PathVariable("test_id")int test_id)
	  {
   	return test_service.gettestById(test_id);
		 
	  }
	@PutMapping("/testname/{id}")
	 public Test updatetestname(@PathVariable("test_id") int test_id, @RequestBody Test test) {
	    	return test_service.upadtetestById(test_id, test);
	       
	    }
	@DeleteMapping("/testname/{id}")
	 public String deletetestname(@PathVariable("test_id") int test_id) {
			return test_service.deletetestById(test_id);
			 
		  }
	
	
	  
	
	
}
