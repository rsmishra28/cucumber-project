package com.learn.boot.demo;

import org.springframework.stereotype.Component;

import javax.print.attribute.IntegerSyntax;

@Component
public class Student {
    Integer studentId ;
    String studentName ;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
