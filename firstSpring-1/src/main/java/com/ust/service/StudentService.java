package com.ust.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.Student;
import com.ust.repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo s;

	public void saveUser(Student stud) {
        s.saveAndFlush(stud);
        System.out.println("Student saved");
    }

	public List<Student> getAll() {
        return s.findAll();
    }

    public Student getStudById(int id) {
        return s.findById(id).orElse(null);
    }

    public List<Student> getStudByName(String name) {
        Optional<List<Student>> stu=s.findByName(name);
        return stu.isEmpty()?null:stu.get();
    }
    
    public Student updateUser(int id, Student stud) {
        Student st=getStudById(id);
        if(st!=null) {
        	s.saveAndFlush(stud);
        	return stud;
        }
        else {
        	return null;
        }
    }

    public String deleteUser(int id) {
        Student st=getStudById(id);
        if(st!=null) {
        	s.delete(st);
        	return "DELETED";
        }
        else {
        	return null;
        }
    }
}
