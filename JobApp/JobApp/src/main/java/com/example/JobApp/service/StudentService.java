package com.example.JobApp.service;

import com.example.JobApp.model.Student;
import org.springframework.stereotype.Service;
import org.w3c.dom.css.Counter;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentService {

    private Map<Integer, Student> studentMap = new HashMap<>();
     private  int idCounter = 1;
    public String addStudent(Student student) {
        studentMap.put(idCounter, student);
        idCounter++;

        return "Student details saved for:" + student.getName();
    }
    public Map<Integer, Student> getAllStudents(){
    return studentMap;
    }
}