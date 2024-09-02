package com.ust.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	  Optional<List<Student>> findByName(String name);

}
