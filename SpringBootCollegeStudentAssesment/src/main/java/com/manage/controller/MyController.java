package com.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.manage.entity.College;
import com.manage.entity.Student;
import com.manage.service.CollegeService;

import java.util.List;

@RestController
@RequestMapping("/colleges")
public class MyController {

    @Autowired
    private CollegeService collegeService;

    @PostMapping
    public College createCollege(@RequestBody College college) {
        return collegeService.createCollege(college);
    }

    @PostMapping("/{collegeId}/students")
    public Student createStudent(@PathVariable Long collegeId, @RequestBody Student student) {
        return collegeService.createStudent(collegeId, student);
    }

    @GetMapping
    public List<College> getAllColleges() {
        return collegeService.getAllColleges();
    }

    @GetMapping("/students")
    public List<Student> getStudentsByCollegeName(@RequestParam String collegeName) {
        return collegeService.getStudentsByCollegeName(collegeName);
    }
}
