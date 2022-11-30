package com.springProject.springApp.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @RestController gives us the ability to expose our resources
 *
 * @RequestMapping maps to our specified path
 */
@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    // In order for this to be exposed as an endpoint we
    // use @GetMapping annotation.
    @GetMapping
    public List<Student> getAllStudents() {
        List<Student> students = Arrays.asList(
                new Student(1L,
                        "Adam",
                        "Adam@gmail.com",
                        Gender.MALE),
                new Student(2L,
                        "David",
                        "David@gmail.com",
                        Gender.MALE)
        );
        return students;
    }
}
