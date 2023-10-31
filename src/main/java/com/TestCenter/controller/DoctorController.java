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

import com.TestCenter.Entity.Doctor;

import com.TestCenter.service.DoctorService;

@RestController
public class DoctorController {
	@Autowired
	DoctorService dr_service;
	
	@PostMapping("/adddoctorname")
	public ResponseEntity<Doctor> adddoctorname(@RequestBody  Doctor doctor  ){
		return new ResponseEntity<> (dr_service.adddoctorname(doctor),HttpStatus.CREATED);
      }
	
	
	@GetMapping("/getdoctorname")
	public List<Doctor> getAlldoctor()
	{
		return dr_service.fetchAllDoctor();
	}
	
	//modify
	@GetMapping("/getdoctor/{id}") 
	public Doctor getdoctorById(@PathVariable("dr_id")int dr_id)
	  {
 	return dr_service.getdoctorById(dr_id);
		 
	  }
	
	
	
	@PutMapping("/doctorname/{id}")
	 public Doctor upadtedoctorById(@PathVariable("dr_id") int dr_id, @RequestBody Doctor doctor) {
	    	return dr_service.upadtedoctorById(dr_id, doctor);
	       
	    }
	@DeleteMapping("/doctorname/{id}")
	 public String deletedoctorById(@PathVariable("dr_id") int dr_id) {
			return dr_service.deletedoctorById(dr_id);
			 
		  }
	
	
	
	
}
