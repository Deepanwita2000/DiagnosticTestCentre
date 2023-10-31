package com.TestCenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TestCenter.Entity.Doctor;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer>{
   
}
