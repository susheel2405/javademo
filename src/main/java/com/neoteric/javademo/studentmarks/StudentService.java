package com.neoteric.javademo.studentmarks;

public class StudentService {

    private Student student;

    public StudentService() {
        this.student = new Student("Susheel Reddy", 101, "BTech Final Year", "Gitam University");
    }

    public void addSubjectMarks(String subjectName, int marks) {
        for (Subject subject : student.getSubjectList().getSubjects()) {
            if (subject.getName().equals(subjectName)) {
                subject.setMarks(marks);
            }
        }
    }

    public int getTotalMarks() {
        return student.getSubjectList().getSubjects().stream().mapToInt(Subject::getMarks).sum();
    }
    public double getPercentage() {
        return (double) getTotalMarks() / (student.getSubjectList().getSubjects().size() * 100) * 100;
    }



    public void displayStudentInfo() {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Class: " + student.getStudentClass());
        System.out.println("College: " + student.getCollege());
        System.out.println("Subjects and Marks:");
        for (Subject subject : student.getSubjectList().getSubjects()) {
            System.out.println(subject.getName() + ": " + subject.getMarks());
        }
        System.out.println("Total Marks: " + getTotalMarks());
        System.out.println("Percentage: " + getPercentage() + "%");
    }

    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        studentService.addSubjectMarks("DAA", 85);
        studentService.addSubjectMarks("OS", 78);
        studentService.addSubjectMarks("IT", 90);
        studentService.addSubjectMarks("Python", 88);
        studentService.addSubjectMarks("Big Data", 92);
        studentService.displayStudentInfo();
    }
}
