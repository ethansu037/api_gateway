package com.ms.student.controller;

import com.ms.student.domain.Student;
import com.ms.student.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/student-api")
public class StudentController {

    @Autowired
    StudentService service;

    @Autowired
    Environment env;


    @RequestMapping(path={"/","/allstudents"}, method = RequestMethod.GET)
    public Set<Student> getAllStudents(){
        return service.getAllStudents();
    }


    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id){
        for(Student student: this.getAllStudents()){
            if(student.getId() == id){
                return student;
            }
        }
        return null;
    }

    @GetMapping("/test")
    public String index(@RequestParam String name) {
        return "hello "+name+"，this is first messge";
    }
    
    @GetMapping("/ribbonServer")
    public String getRibbonServerPort(){
        String port = env.getProperty("server.port");
        return ">>>> Response from Student Ribbon Port: " + port;
    }
}
