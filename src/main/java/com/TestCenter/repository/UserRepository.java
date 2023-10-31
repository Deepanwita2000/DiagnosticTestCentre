package com.TestCenter.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TestCenter.Entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>//new
{

}

