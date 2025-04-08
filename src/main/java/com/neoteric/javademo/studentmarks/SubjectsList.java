package com.neoteric.javademo.studentmarks;

import java.util.ArrayList;
import java.util.List;

public class SubjectsList {

    public List<Subject> subjects;

    public SubjectsList(){
        subjects = new ArrayList<>();
        subjects.add(new Subject("DAA"));
        subjects.add(new Subject("OS"));
        subjects.add(new Subject("IT"));
        subjects.add(new Subject("Python"));
        subjects.add(new Subject("Big Data"));

    }

    public List<Subject> getSubjects(){
        return subjects;
    }
}
