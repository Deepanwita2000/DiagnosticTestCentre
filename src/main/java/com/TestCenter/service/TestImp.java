package com.TestCenter.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
//import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestCenter.Entity.Test;
import com.TestCenter.repository.TestRepository;
@Service
public class TestImp implements TestService{
	@Autowired
	TestRepository test_repo;
	
	public Test addtestname(Test test)
	{
		return test_repo.save(test);
	}
	
	public List<Test> fetchAllTest()
	{
		List<Test> allTest = test_repo.findAll();
		return allTest;
	}
	
	public Test gettestById(int test_id)
	{
		Optional<Test> test = test_repo.findById(test_id);
		if (test.isPresent()) {

			return test.get();
		}
		return null;
	}
	
	
	public Test upadtetestById(int test_id,Test test)
	{
Optional<Test> p1 = test_repo.findById(test_id);
		
		if (p1.isPresent()) {
			
			Test originaltest = p1.get();
			
			 if (Objects.nonNull(test.getTest_name()) && !"".equalsIgnoreCase(test.getTest_name())) {
				 originaltest.setTest_name(test.getTest_name());
	            }
			 
			 if (Objects.nonNull(test.getTest_date()) ) {
				 originaltest.setTest_date(test.getTest_date());
	            }
			 
			
			 
			return test_repo.save(originaltest);
	            
			
		}
		return null;
	}
	
	
	public String deletetestById(int test_id)
	{
if(test_repo.findById(test_id).isPresent()) {
			
			test_repo.deleteById(test_id);
			return "user deleted successfully";
		}
		return "No such user in the database";
	}
}
