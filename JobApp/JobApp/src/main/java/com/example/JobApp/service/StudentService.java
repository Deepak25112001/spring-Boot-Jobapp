package com.example.JobApp.service;

import com.example.JobApp.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public String addStudent(Student student) {
        if (student.getName() == null || student.getName().isEmpty()) {
            return "Student name is required!";
        }
        if (student.getEmail() == null || student.getEmail().isEmpty()) {
            return "Email is required!";
        }
        if (student.getPhone() == null || student.getPhone().isEmpty()) {
            return "Phone number is requried!";
        }
        return "Student details saved for:"+student.getName();
    }

}
