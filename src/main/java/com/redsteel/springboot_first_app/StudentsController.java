package com.redsteel.springboot_first_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentsController {
    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Red", "Steel"));
        students.add(new Student("John", "Doe"));
        students.add(new Student("PubgMobile", "Luffy"));
        return students;
    }
}
