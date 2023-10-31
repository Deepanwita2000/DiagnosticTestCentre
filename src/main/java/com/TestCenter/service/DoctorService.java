package com.TestCenter.service;

import java.util.List;

import com.TestCenter.Entity.Doctor;



public interface DoctorService {
	Doctor adddoctorname(Doctor doctor); // Insert
	List<Doctor> fetchAllDoctor(); // select
	Doctor getdoctorById(int dr_id); // select by id
	Doctor upadtedoctorById(int dr_id , Doctor doctor); // Update
	String deletedoctorById(int dr_id);
}
