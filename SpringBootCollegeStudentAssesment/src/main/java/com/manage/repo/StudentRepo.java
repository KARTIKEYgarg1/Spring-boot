package com.manage.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manage.entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{
    List<Student> findByCollegeNameOrderByNameDesc(String collegeName);

}
