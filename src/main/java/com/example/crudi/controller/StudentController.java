package com.example.crudi.controller;

import com.example.crudi.entity.Student;
import com.example.crudi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAll(){
        return studentService.getStudents();
    }

    @PostMapping
    public Student saveUpdate(@RequestBody Student student){
        studentService.saveOrUpdate(student);
        return student;
    }

    @DeleteMapping("/{id}")
    public void deleteStudents(@PathVariable("id") Long studentId){
        studentService.deleteStudent(studentId);
    }

    @GetMapping("/{id}")
    public Optional<Student> getById(@PathVariable("id") Long studentId){
        return studentService.getStudent(studentId);
    }
}
