package com.neoteric.javademo.studentmarks;

public class Subject {

    private String name;
    private int marks;


    public Subject(String name){
        this.name = name;
        this.marks = 0;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

}
