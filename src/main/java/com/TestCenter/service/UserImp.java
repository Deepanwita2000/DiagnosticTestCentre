package com.TestCenter.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.DiagnosticTest.repository.UserRepository;
import com.TestCenter.Entity.User;
import com.TestCenter.repository.UserRepository;
@Service
public class UserImp implements UserService//New
{
 
	@Autowired
	UserRepository user_repo;
	@Override
	public User addUser(User user)
	{
		return user_repo.save(user);
	}
	
	public List<User> fetchAllUser()
	{
		List<User> allUser = user_repo.findAll();
		return allUser;
	}
	public User getUserById(int user_id)
	{
		Optional<User> user = user_repo.findById(user_id);
		if (user.isPresent()) {

			return user.get();
		}
		return null;
	}
	public User upadteUserById(int user_id, User user)
	{
Optional<User> d1 = user_repo.findById(user_id);
		
		if (d1.isPresent()) {
			
			User originalUser = d1.get();
			
			 if (Objects.nonNull(user.getUsername()) && !"".equalsIgnoreCase(user.getUsername())) {
				 originalUser.setUsername(user.getUsername());
	            }
			 
			 
			 if (Objects.nonNull(user.getEmail()) && !"".equalsIgnoreCase(user.getEmail())) {
				 originalUser.setEmail(user.getEmail());
	            }
			
			 
			 if (Objects.nonNull(user.getPassword()) && !"".equalsIgnoreCase(user.getPassword())) {
				 originalUser.setPassword(user.getPassword());
	            }
			 
			
			 
			return user_repo.save(originalUser);
	            
			
		}
		return null;
	}
	public String deleteUserById(int user_id)
	{
		if(user_repo.findById(user_id).isPresent()) {
			user_repo.deleteById(user_id);
			
			return "user deleted successfully";
		}
		return "No such user in the database";
	}
	
}
