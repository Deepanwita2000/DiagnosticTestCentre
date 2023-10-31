package com.TestCenter.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestCenter.Entity.Doctor;

import com.TestCenter.repository.DoctorRepository;

@Service
public class DoctorImp implements DoctorService{

	@Autowired
	DoctorRepository dr_repo;
	
	public Doctor adddoctorname(Doctor doctor)
	{
		return dr_repo.save(doctor);
	}
	public List<Doctor> fetchAllDoctor()
	{
		List<Doctor> allDoctor = dr_repo.findAll();
		return allDoctor;
	}
	
	
	
	
	public Doctor getdoctorById(int dr_id)
	{
		Optional<Doctor> doctor = dr_repo.findById(dr_id);
		if (doctor.isPresent()) {

			return doctor.get();
		}
		return null;
	}
	
	
	
	public Doctor upadtedoctorById(int dr_id , Doctor doctor)
	{
Optional<Doctor> d1 = dr_repo.findById(dr_id);
		
		if (d1.isPresent()) {
			
			Doctor originaldoctor = d1.get();
			
			 if (Objects.nonNull(doctor.getDr_name()) && !"".equalsIgnoreCase(doctor.getDr_name())) {
				 originaldoctor.setDr_name(doctor.getDr_name());
	            }
			 
			 if (Objects.nonNull(doctor.getDr_email()) && !"".equalsIgnoreCase(doctor.getDr_email())) {
				 originaldoctor.setDr_email(doctor.getDr_email());
	            }
			 if (Objects.nonNull(doctor.getSpecialization()) && !"".equalsIgnoreCase(doctor.getSpecialization())) {
				 originaldoctor.setSpecialization(doctor.getSpecialization());
	            }
			 
			
			 
			return dr_repo.save(originaldoctor);
	            
			
		}
		return null;
	}
	
	
	
	
	public String deletedoctorById(int dr_id)
	{
		if(dr_repo.findById(dr_id).isPresent()) {
			
			dr_repo.deleteById(dr_id);
			return "user deleted successfully";
		}
		return "No such user in the database";
	}
	
}
	

