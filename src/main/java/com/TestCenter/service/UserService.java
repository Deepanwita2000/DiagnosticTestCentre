package com.TestCenter.service;

import java.util.List;

import com.TestCenter.Entity.User;

public interface UserService //new
{


User addUser(User user); // Insert
List<User> fetchAllUser(); // select
User getUserById(int user_id); // select by id
User upadteUserById(int user_id, User user); // Update
String deleteUserById(int user_id);
}