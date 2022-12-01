package com.springProject.springApp.student;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

// Handles the business logic
@AllArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        // Executes sql behind scenes
        return studentRepository.findAll();
    }
}
