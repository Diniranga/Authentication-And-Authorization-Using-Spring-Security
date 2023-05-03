package com.example.demo.Student;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1,"Induranga"),
            new Student(2,"Jayaranga"),
            new Student(3,"Diniranga")
    );


    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_ADMINTRAINEE')")
    public List<Student> getAllStudents(){
        return STUDENTS;
    }

    @PostMapping
    @PreAuthorize("hasAuthority('student:write')")
    public void registerNewStudent(@RequestBody Student student){
        System.out.println(student);
    }

    @DeleteMapping(path = "{studentID}")
    @PreAuthorize("hasAuthority('student:write')")
    public void deleteStudent(@PathVariable("studentID") Integer studentID){
        System.out.println(studentID);
    }

    @PutMapping(path = "{studentID}")
    @PreAuthorize("hasAuthority('student:write')")
    public void updateStudent(@PathVariable("studentID") Integer studentID,@RequestBody Student student){
        System.out.printf("%s : %s%n",studentID,student);
    }
}
