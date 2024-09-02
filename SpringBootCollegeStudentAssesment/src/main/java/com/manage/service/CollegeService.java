package com.manage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manage.entity.College;
import com.manage.entity.Student;
import com.manage.repo.CollegeRepo;
import com.manage.repo.StudentRepo;

@Service
public class CollegeService {

	@Autowired 
	private CollegeRepo cRepo;
	@Autowired 
	private StudentRepo sRepo;
	
    public College createCollege(College college) {
        return cRepo.save(college);
    }

    public Student createStudent(Long collegeId, Student student) {
        Optional<College> college = cRepo.findById(collegeId);
        if(college.isPresent()) {
        	student.setCollege(college.get());
        	return sRepo.save(student);
        }else
    		return null;
    }

    public List<College> getAllColleges() {
        return cRepo.findAll();
    }

    public List<Student> getStudentsByCollegeName(String collegeName) {
        return sRepo.findByCollegeNameOrderByNameDesc(collegeName);
    }
}
