package com.TestCenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TestCenter.Entity.Test;
@Repository
public interface TestRepository extends JpaRepository<Test, Integer>{

}
