package com.example.JobApp.controll;

import com.example.JobApp.model.Student;
import com.example.JobApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService service;

    // POST API to add student
    @PostMapping("/student")
    public String addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    // GET API to test in browser
    @GetMapping("/student")
    public String testApi() {
        return "Student API is running!";
    }
}
