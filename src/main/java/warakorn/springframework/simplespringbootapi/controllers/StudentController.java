package warakorn.springframework.simplespringbootapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import warakorn.springframework.simplespringbootapi.services.StudentService;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/student")
    private String getStudent() {
        return studentService.getStudent();
    }
}
