package com.office.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.office.entity.Employee;
@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
