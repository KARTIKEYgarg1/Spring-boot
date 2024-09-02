package com.manage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manage.entity.College;

@Repository
public interface CollegeRepo extends JpaRepository<College, Long>{
   public College findByName(String name);

}
