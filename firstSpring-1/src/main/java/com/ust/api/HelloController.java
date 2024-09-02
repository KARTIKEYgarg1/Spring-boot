package com.ust.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ust.Student;
import com.ust.service.StudentService;

@RestController
@RequestMapping(path = "/students")
public class HelloController {

	@Autowired
	private StudentService studentService;

	// Get all students
	@GetMapping("/all")
	public List<Student> getAllStudents() {
		return studentService.getAll();
	}

	// Get using id
	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable int id) {
		Student e= studentService.getStudById(id);
		if(e==null) return new ResponseEntity("Not Found",HttpStatus.NOT_FOUND);
		else return new ResponseEntity<Student>(e,HttpStatus.OK);
	}
		
	// Get using name
	@GetMapping("/name/{name}")
	public List<Student> getStudentByName(@PathVariable String name) {
		return studentService.getStudByName(name);
	}
	
	@PostMapping("/create")
	public Student create(@RequestBody Student stud) {
		 studentService.saveUser(stud);
		 return stud;
	}

	@PutMapping("/update")
	@SuppressWarnings("all")
	public ResponseEntity<Student> update(@RequestBody Student stud) {
		 Student n=studentService.updateUser(stud.getId(),stud);
			if(n==null) return new ResponseEntity("Not Found",HttpStatus.NOT_FOUND);
			else return new ResponseEntity<Student>(n,HttpStatus.OK);
		}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> update(@PathVariable int id) {
		 String msg=studentService.deleteUser(id);
			if(msg==null) return new ResponseEntity("Not Found",HttpStatus.NOT_FOUND);
			else return new ResponseEntity<String>(msg,HttpStatus.OK);
		}
}
