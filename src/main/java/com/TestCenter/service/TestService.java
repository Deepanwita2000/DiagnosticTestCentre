package com.TestCenter.service;

import java.util.List;

import com.TestCenter.Entity.Test;

public interface TestService {
	Test addtestname(Test test); // Insert
	List<Test> fetchAllTest(); // select
	Test gettestById(int test_id); // select by id
	Test upadtetestById(int test_id,Test test); // Update
	String deletetestById(int test_id);
}
