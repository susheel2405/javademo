package com.neoteric.javademo.studentmarks;

public class Student {

    private String name;
    private int rollNumber;
    private String studentClass;
    private String college;
    private SubjectsList subjectList;

    public Student(String name, int rollNumber, String studentClass, String college) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.studentClass = studentClass;
        this.college = college;
        this.subjectList= new SubjectsList();
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public String getCollege() {
        return college;
    }

    public SubjectsList getSubjectList() {
        return subjectList;
    }
}

