package com.neoteric.javademo.familytree;

public class Person {
    String name;
    int age;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void display(){
        System.out.println("name:" + name + ", Age" + age);
    }
}
