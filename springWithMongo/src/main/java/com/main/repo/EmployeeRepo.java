package com.main.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.main.Employee;

public interface EmployeeRepo extends MongoRepository<Employee, Integer>{
public List<Employee> findByNameAndEmail(String name,String email);
}
