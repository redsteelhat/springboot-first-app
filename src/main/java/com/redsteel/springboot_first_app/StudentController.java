package com.redsteel.springboot_first_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    // http://localhost:8080/student/query?firstName=Red&lastName=Steel

    @GetMapping("/student/query")
    public Student studentQuery(@RequestParam(name = "firstName") String firstName,
                                @RequestParam(name = "lastName") String lastName) {
        return new Student(firstName, lastName);
    }

}
