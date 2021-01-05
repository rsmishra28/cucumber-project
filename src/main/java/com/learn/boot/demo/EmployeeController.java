package com.learn.boot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EmployeeController {


    List<Student> student;


    @RequestMapping ("/hello")
    public  void sayHello(){

        Student s1 = new Student();
        s1.setStudentId(1);
        s1.setStudentName("rdm");

        student.add(s1);

        Student s2 = new Student();
        s2.setStudentId(1);
        s2.setStudentName("rdm");
        student.add(s2);

        System.out.println("Studens size " + student.size());
        System.out.println("Hello");
    }
}
